package app.repository;

import java.util.List;

import app.entidade.Usuario;

public interface INameRepository {
	
	List<Usuario> findAllName();
	
	void insertName(String name);
	
}
