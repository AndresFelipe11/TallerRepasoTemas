package modelos;
import javax.persistence.*;


@Entity
@DiscriminatorValue("asalariado")
public class EmpleadoAsalariado extends Empleado {
	
	private double salarioSemanal;
	
	public EmpleadoAsalariado() {
		// TODO Auto-generated constructor stub
	}
	
	public EmpleadoAsalariado(String identificador, String nombre, double salarioSemanal) {
		super(identificador, nombre);
		this.salarioSemanal=salarioSemanal;
		
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	
	
	

}
