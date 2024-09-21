import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXml {
	public static String ObjectToXml (Persona persona) {
		String xmlString = null;
        try {
            // Crear un contexto JAXB
            JAXBContext context = JAXBContext.newInstance(Persona.class);

            // Crear un marshaller
            Marshaller marshaller = context.createMarshaller();

            // Configurar el marshaller para que formatee el XML
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Convertir el objeto a XML
            StringWriter writer = new StringWriter();
            marshaller.marshal(persona, writer);

            // Mostrar el XML resultante
            xmlString = writer.toString();
            System.out.println("XML resultante:");
            System.out.println(xmlString);
            
            
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xmlString;
	}
    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona = new Persona("Juan", 30);

        try {
            // Crear un contexto JAXB
            JAXBContext context = JAXBContext.newInstance(Persona.class);

            // Crear un marshaller
            Marshaller marshaller = context.createMarshaller();

            // Configurar el marshaller para que formatee el XML
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Convertir el objeto a XML
            StringWriter writer = new StringWriter();
            marshaller.marshal(persona, writer);

            // Mostrar el XML resultante
            String xmlString = writer.toString();
            System.out.println("XML resultante:");
            System.out.println(xmlString);
            
            
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
