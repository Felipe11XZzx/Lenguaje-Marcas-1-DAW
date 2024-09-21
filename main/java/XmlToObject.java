import javax.xml.bind.*;
import java.io.StringReader;

public class XmlToObject {
	public static Persona XmlToObject(String xml) {
		Persona persona = null;
		try {
            // Crear un contexto JAXB
            JAXBContext context = JAXBContext.newInstance(Persona.class);

            // Crear un unmarshaller
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Convertir el XML a objeto
            StringReader reader = new StringReader(xml);
            persona = (Persona) unmarshaller.unmarshal(reader);

            // Mostrar el objeto resultante
            System.out.println("Objeto Persona:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
		return persona;
	}
    public static void main(String[] args) {
        // XML de ejemplo
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n"
        		+ "<persona>\r\n"
        		+ "    <edad>30</edad>\r\n"
        		+ "    <nombre>Juan</nombre>\r\n"
        		+ "</persona>";

        try {
            // Crear un contexto JAXB
            JAXBContext context = JAXBContext.newInstance(Persona.class);

            // Crear un unmarshaller
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Convertir el XML a objeto
            StringReader reader = new StringReader(xml);
            Persona persona = (Persona) unmarshaller.unmarshal(reader);

            // Mostrar el objeto resultante
            System.out.println("Objeto Persona:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
