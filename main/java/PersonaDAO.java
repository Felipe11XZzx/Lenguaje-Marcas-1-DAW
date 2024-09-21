import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.modules.XMLResource;
import org.xmldb.api.modules.XPathQueryService;

public class PersonaDAO {
	
	public static Persona getPersona(String nbXml) {
		String xml = getXmlPersona(nbXml);
		Persona persona = XmlToObject.XmlToObject(xml);
		System.out.println(persona.toString());
		return persona;
	}
	public static int setPersona(Persona persona,String nbXml) {
		String xml = ObjectToXml.ObjectToXml(persona);
	    return setXmlPersona(nbXml,xml);	
		}
	public static Persona updatePersona(Persona persona,String nbXml) {
		//realizamos el update
		Persona persona2 = getPersona(nbXml);
		persona2.setNombre(persona.getNombre());
		persona2.setEdad(persona.getEdad());
		String xml = ObjectToXml.ObjectToXml(persona2);
	    setXmlPersona(nbXml,xml);
	    //obtenemos de la bbdd el xml
	    String xml2 = getXmlPersona(nbXml);
		Persona persona3 = XmlToObject.XmlToObject(xml2);
		System.out.println(persona3.toString());
		return persona3;
	}
	

	public static int setXmlPersona(String name,String xml) {
		String uri = "xmldb:exist://localhost:8080/exist/xmlrpc";
        String username = "admin";
        String password = "root";
        String collectionPath = "/db";

        try {
            // Load and register the driver
            Class<?> cl = Class.forName("org.exist.xmldb.DatabaseImpl");
            Database database = (Database) cl.newInstance();
            DatabaseManager.registerDatabase(database);

            // Connect to the database
            Collection col = DatabaseManager.getCollection(uri + collectionPath, username, password);
            if (col == null) {
                System.out.println("Collection not found");
                return -1;
            }

            // Crear un nuevo recurso XML
            String resourceName = name;
            XMLResource document = (XMLResource) col.createResource(resourceName, "XMLResource");
            document.setContent(xml);

            // Insertar el recurso en la colección
            col.storeResource(document);
            
            System.out.println("XML insertado con éxito.");
            

            // Clean up
            col.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
	private static String getXmlPersona(String nombre) {
		String xmlContent = null;
		try {
        	Class<?> cl = Class.forName("org.exist.xmldb.DatabaseImpl");
            Database database = (Database) cl.newInstance();
            DatabaseManager.registerDatabase(database);

            // Obtener una conexión al servidor eXist-db
            String URI = "xmldb:exist://localhost:8080/exist/xmlrpc";
            String user = "admin";
            String password = "root";
            Collection col = DatabaseManager.getCollection(URI + "/db", user, password);

            // Nombre del archivo XML a extraer
            String resourceName = nombre;
            
            // Verificar si el recurso existe
            if (col == null) {
                System.out.println("La colección no existe");
            } else {
                // Obtener el recurso XML
                XMLResource document = (XMLResource) col.getResource(resourceName);

                if (document == null) {
                    System.out.println("El documento XML no existe");
                } else {
                    // Obtener el contenido del recurso XML
                    xmlContent = (String) document.getContent();
                    System.out.println("Contenido del archivo XML:");
                    System.out.println(xmlContent);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return xmlContent;
	}

}
