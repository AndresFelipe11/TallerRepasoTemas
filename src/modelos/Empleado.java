package modelos;
import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Empleado {
	
	
	private String identificador;
	private String nombre;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String identificador, String nombre) {
		
		this.identificador = identificador;
		this.nombre = nombre;
	}

	public abstract double calcularSalario();

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
