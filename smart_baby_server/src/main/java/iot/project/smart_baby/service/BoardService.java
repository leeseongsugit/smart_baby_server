package iot.project.smart_baby.service;

import java.util.Map;

import iot.project.smart_baby.model.Board;

public interface BoardService {
	Map<String, Object> getPage(int page) throws Exception;

	public Board findById(long boardId) throws Exception;

	public void create(Board board) throws Exception;

	public void update(Board board) throws Exception;

	public void delete(Board board) throws Exception;
}
