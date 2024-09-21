import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaDAO dao = new PersonaDAO();
		Persona persona = new Persona("Pedro",25);
		
		
		String xml = ObjectToXml.ObjectToXml(persona);
		String nbXml = "persona.xml";
		PersonaDAO.setXmlPersona(nbXml,xml);
		Persona persona2 = dao.getPersona("persona.xml");
		System.out.println(persona2.toString());
		Persona persona3 = new Persona("Pedro",30);
		dao.updatePersona(persona3, nbXml);
	}

}
