package modelos;

public class FabricaEmpleados {
	
	public static Empleado crearEmpleado(String identificador, String nombre, 
			double salarioSemanal,double valorHora, int horasTrabajadas, 
			double valorVentas, char tipo) {
		switch (tipo) {
		case 'a':
		case 'A':
			return new EmpleadoAsalariado(identificador, nombre, salarioSemanal);
		case 'c':
		case 'C':
			return new EmpleadoComision(identificador, nombre, salarioSemanal, valorVentas);
		case 'h':
		case 'H':
			return new EmpleadoHora(identificador, nombre, valorHora, horasTrabajadas);
		}
		return null;
	}

}
