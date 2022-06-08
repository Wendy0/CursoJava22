package es.com.alliance.curso.modelo.dao;

import java.sql.SQLException;
import java.util.List;

import es.com.alliance.curso.modelo.Model;



public interface DAO {
	public void agregar (Model pModel) throws ClassNotFoundException, SQLException;
	public void modificar(Model pModel) throws ClassNotFoundException, SQLException;
	public void eliminar(Model pModel) throws ClassNotFoundException, SQLException;
	public List<Model> leer(Model pModel) throws ClassNotFoundException, SQLException;
}
