package modelos;

public class EmpleadoHora extends Empleado{
	private double valorHora;
	private int horasTrabajadas;
	
	public EmpleadoHora(String identificador, String nombre, double valorHora, int horasTrabajadas) {
		super(identificador, nombre);
		this.valorHora = valorHora;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	@Override
	public double calcularSalario() {
		if (horasTrabajadas > 40) {
			return valorHora*horasTrabajadas + 200000;
		}
		return valorHora*horasTrabajadas; 
	}
}
