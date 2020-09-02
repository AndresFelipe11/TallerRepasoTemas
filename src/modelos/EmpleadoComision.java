package modelos;

import javax.persistence.*;

@Entity
@DiscriminatorValue("comision")
public class EmpleadoComision extends Empleado{
	private double salarioSemanal;
	private double valorVentas;
	
	public EmpleadoComision() {
		// TODO Auto-generated constructor stub
	}

	public EmpleadoComision(String identificador, String nombre, double salarioSemanal, double valorVentas) {
		super(identificador, nombre);
		this.salarioSemanal = salarioSemanal;
		this.valorVentas = valorVentas;
	}

	@Override
	public double calcularSalario() {
		return salarioSemanal + (valorVentas * 0.05);
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	public double getValorVentas() {
		return valorVentas;
	}

	public void setValorVentas(double valorVentas) {
		this.valorVentas = valorVentas;
	}

}
