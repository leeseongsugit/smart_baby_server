package iot.project.smart_baby.dao;

import java.util.List;
import java.util.Map;

public interface CrudDao<M, K> {
	
//	Create (DML : INSERT)
	int insert(M m) throws Exception;
	
//	Read (DML : SELECT)
	int count() throws Exception;
	M findById(K k) throws Exception;
	List<M> getList() throws Exception;
	List<M> getPage() throws Exception;
	List<M> getPage(Map map) throws Exception;
	
//	Update (DML : UPDATE)
	int update(M m) throws Exception;
	
//	Delete (DML : DELETE)
	int delete(K k) throws Exception;

}
