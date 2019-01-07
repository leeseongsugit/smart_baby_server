package iot.project.smart_baby.dao;

import iot.project.smart_baby.model.Board;

public interface BoardDao extends CrudDao<Board, Long>{
	void increaseReadCnt(long id) throws Exception;
}
