package modelos;

public class EmpleadoAsalariado extends Empleado {
	
	private double salarioSemanal;
	
	public EmpleadoAsalariado(String identificador, String nombre, double salarioSemanal) {
		super(identificador, nombre);
		this.salarioSemanal=salarioSemanal;
		
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioSemanal;
	}

}
