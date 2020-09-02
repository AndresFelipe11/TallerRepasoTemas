package modelos;

import javax.persistence.*;

@Entity
@DiscriminatorValue("hora")
public class EmpleadoHora extends Empleado{
	private double valorHora;
	private int horasTrabajadas;
	
	public EmpleadoHora() {
		// TODO Auto-generated constructor stub
	}
	
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

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
}
