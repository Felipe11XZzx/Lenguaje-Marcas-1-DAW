import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;
import org.xmldb.api.*;
import java.io.*;
public class ExistDBXPathExample {
	public static void main(String[] args) {
		// Configurar las credenciales y la URL de la base de datos Exist-DB
		String uri = "xmldb:exist://localhost:8080/exist/xmlrpc";
		String username = "your_username";
		String password = "your_password";
		try {
			// Inicializar el controlador Exist-DB
			Class.forName("org.exist.xmldb.DatabaseImpl");
			// Establecer la conexión a la base de datos
			Database database = (Database) Class.forName("org.exist.xmldb.DatabaseImpl").newInstance();
			DatabaseManager.registerDatabase(database); Collection collection = DatabaseManager.getCollection(uri, username, password);
			// Definir la consulta XPath
			String xpath = "//book/title";
			// Ejecutar la consulta XPath
			XPathQueryService xpathService = (XPathQueryService) collection.getService("XPathQueryService", "1.0");
			xpathService.setProperty("indent", "yes");
			ResourceSet result = xpathService.query(xpath);
			// Recuperar y mostrar los resultados
			ResourceIterator i = result.getIterator();
			while (i.hasMoreResources()) {
				Resource r = i.nextResource();
				System.out.println((String) r.getContent());
			}
			// Cerrar la conexión collection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (XMLDBException e) {
			e.printStackTrace();
		}
	}
}