package Control;

import java.util.List;

import Control.EmpleadoException;
import modelos.Empleado;
import modelos.FabricaEmpleados;
import persistencia.OrmEmpleados;
import persistencia.RepositorioCompania;

public class ControlCompania {
	
	private RepositorioCompania repositorioCompania;
	
	public ControlCompania() {
		repositorioCompania = new OrmEmpleados();
	}
	
	public ControlCompania(RepositorioCompania repositorioCompania) {
		this.repositorioCompania = repositorioCompania;
	}
	
	public boolean adicionarEmpleado(String identificacion, String nombre, double salarioSemanal,
			 double valorHoras, int horasTrabajadas, double ventasRealizadas, char tipo) {

		Empleado empleadoBuscado = buscarEmpleado(identificacion);
		if (empleadoBuscado == null) {
			Empleado empleadoNuevo = FabricaEmpleados.crearEmpleado(identificacion, nombre, salarioSemanal, 
											valorHoras, horasTrabajadas, ventasRealizadas, 
											tipo);
			return this.repositorioCompania.adicionarEmpleado(empleadoNuevo);
		}

		return true;
	}
	
	public Empleado buscarEmpleado(String identificacion) {
		return this.repositorioCompania.buscarEmpleado(identificacion);
	}
	
	
	public void eliminarEmpleado() {
		List<Empleado> empleados = this.repositorioCompania.consultarEmpleados();
		for (Empleado empleado : empleados) {
			 this.repositorioCompania.eliminarEmpleado(empleado);	
		}
	}
	
	public double calcularNomina() throws EmpleadoException {
		List<Empleado> empleados = this.repositorioCompania.consultarEmpleados();
		double nomina = 0;
		System.out.println(empleados.size());
		if(empleados.size() == 0) {
			throw new EmpleadoException("No hay empleados registrados para calcular la nómina");
		}
		
		for (Empleado empleado: empleados) {
			nomina += empleado.calcularSalario();
		}
		
		return nomina;
	}

}
