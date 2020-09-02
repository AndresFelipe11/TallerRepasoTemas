package modelos;

public class EmpleadoComision extends Empleado{
	private double salarioSemanal;
	private double valorVentas;

	public EmpleadoComision(String identificador, String nombre, double salarioSemanal, double valorVentas) {
		super(identificador, nombre);
		this.salarioSemanal = salarioSemanal;
		this.valorVentas = valorVentas;
	}

	@Override
	public double calcularSalario() {
		return salarioSemanal + (valorVentas * 0.05);
	}

}
