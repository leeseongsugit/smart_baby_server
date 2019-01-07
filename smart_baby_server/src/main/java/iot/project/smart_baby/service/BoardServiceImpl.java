package iot.project.smart_baby.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iot.project.smart_baby.dao.BoardDao;
import iot.project.smart_baby.model.Board;
import iot.project.smart_baby.model.Pagination;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao dao;
	
	@Override
	public Map<String, Object> getPage(int page) throws Exception {
		Map<String, Object> map = new HashMap<>();
		
		int total = dao.count();
		Pagination pagination = new Pagination(page, total);
		map.put("pagination", pagination);
		map.put("list", dao.getPage(pagination.getPageMap()));
		
		return map;
	}

	@Override
	public Board findById(long boardId) throws Exception {
		dao.increaseReadCnt(boardId);
		Board board = dao.findById(boardId);
		return board;
	}

	@Override
	public void create(Board board) throws Exception {
		dao.insert(board);
	}

	@Override
	public void update(Board board) throws Exception {
		dao.update(board);

	}

	@Override
	public void delete(Board board) throws Exception {
		dao.delete(board.getId());
	}

}
