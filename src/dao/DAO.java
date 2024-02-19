package dao;

import java.util.List;

public interface DAO <E, K> {


	E findById(K key);
	
	boolean insert(E entidad);
	
	void delete (E entidad);
	
	void update (E entidad);
		
	List<E> getAll();

	
	
}
