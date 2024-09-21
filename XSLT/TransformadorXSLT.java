package XSLT;
import net.sf.saxon.TransformerFactoryImpl;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class TransformadorXSLT {

    public static void main(String[] args) {
        try {
            // Rutas de los archivos XML y XSLT
            String xmlPath = "./Ejercicio Nota4.xml";
            String xsltPath = "./Ejercicio Nota4.xslt";
            String outputPath = "./Ejercicio Nota4.html";

            // Crear una f�brica de transformadores Saxon
            TransformerFactory transformerFactory = new TransformerFactoryImpl();

            // Crear un transformador a partir de la hoja de estilo XSLT
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(new File(xsltPath)));

            // Especificar el archivo XML de entrada
            StreamSource inputXml = new StreamSource(new File(xmlPath));

            // Especificar el archivo de salida HTML
            StreamResult outputHtml = new StreamResult(new File(outputPath));

            // Realizar la transformaci�n
            transformer.transform(inputXml, outputHtml);

            System.out.println("Transformaci�n XML con XSLT completada con �xito.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
