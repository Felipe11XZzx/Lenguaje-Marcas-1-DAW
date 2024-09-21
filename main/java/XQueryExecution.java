import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.modules.XPathQueryService;
public class XQueryExecution {
public static void main(String[] args) {
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
return;
}
// Preparar la consulta XQuery para obtener todos los documentos en la colección
String xqueryExpression = "for $book in collection('/db/books')/bookstore/book where $book/author = 'J.K. Rowling' return $book";
// Ejecutar la consulta XQuery
XPathQueryService service = (XPathQueryService) col.getService("XPathQueryService", "1.0");
ResourceSet result = service.query(xqueryExpression);
// Mostrar los resultados
ResourceIterator i = result.getIterator();
while (i.hasMoreResources()) {
Resource r = i.nextResource();
System.out.println((String) r.getContent());
}
} catch (Exception e) {
e.printStackTrace();
}
}
}