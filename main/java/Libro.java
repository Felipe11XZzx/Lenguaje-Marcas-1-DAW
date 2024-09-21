import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Libro {
	@XmlElement
	String nombre;
	@XmlElement
	String fecha;
	@XmlElement
	String genero;
	public Libro() {
		
	}
	public Libro (String nombre,String fecha,String genero) {
		this.nombre=nombre;
		this.fecha=fecha;
		this.genero=genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
