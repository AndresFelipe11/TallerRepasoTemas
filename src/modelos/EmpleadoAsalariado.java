package modelos;

public class EmpleadoAsalariado extends Empleado {
	private double salarioSemanal;
	
	public EmpleadoAsalariado(String identificador, String nombre) {
		super(identificador, nombre);
		
	}
	
	@Override
	public double calcularSalario() {
		
		return this.salarioSemanal;
	}

}
