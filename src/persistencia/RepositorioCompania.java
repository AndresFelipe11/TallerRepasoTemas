package persistencia;

import java.util.List;

import modelos.Empleado;

public interface RepositorioCompania {

	public abstract boolean adicionarEmpleado(Empleado empleado);
	
	public abstract Empleado buscarEmpleado(String identificacion);
	
	public abstract boolean eliminarEmpleado(Empleado empleado);
		
	public abstract List<Empleado> consultarEmpleados();
}
