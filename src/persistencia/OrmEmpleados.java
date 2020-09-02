package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelos.Empleado;

public class OrmEmpleados implements RepositorioCompania {
	
	private EntityManager gestorDB;
	
	public OrmEmpleados() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Compania");
		gestorDB = fabrica.createEntityManager();
	}
	
	@Override
	public boolean adicionarEmpleado(Empleado empleado) {
		try	{
			gestorDB.getTransaction().begin();
			gestorDB.persist(empleado);
			gestorDB.getTransaction().commit();
		}
		catch (Exception error)	{
			return false;
		}
		return true;
	}

	@Override
	public Empleado buscarEmpleado(String identificacion) {
		Empleado empleado = gestorDB.find(Empleado.class, identificacion);
		return empleado;
	}

	@Override
	
	public boolean eliminarEmpleado(Empleado empleado) {
		
		try	{
			gestorDB.getTransaction().begin();
			gestorDB.remove(empleado);
			gestorDB.getTransaction().commit();
		}
		catch (Exception errorBorrar)	{
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> consultarEmpleados() {
		Query query = gestorDB.createQuery("select e from Empleado e");
		List<Empleado> empleados = query.getResultList();
		return empleados;
	}
	
	@Override
	protected void finalize() {
		gestorDB.close();
	}
}
