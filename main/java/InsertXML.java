import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;
import org.xmldb.api.*;
public class InsertXML {
	public static void main(String[] args) {
		// Connection details
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
			Collection col = DatabaseManager.getCollection(uri +
					collectionPath, username, password);
			if (col == null) {
				System.out.println("Collection not found");
				return;

			}
			// Crear un nuevo recurso XML
			String resourceName = "nuevo.xml";
			XMLResource document = (XMLResource)
					col.createResource(resourceName, "XMLResource");
			document.setContent("<root><dato>ejemplo</dato></root>");
			// Insertar el recurso en la colección
			col.storeResource(document);
			System.out.println("XML insertado con éxito.");

			// Clean up
			col.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}