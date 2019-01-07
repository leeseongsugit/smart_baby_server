package iot.project.smart_baby.dao;

import java.util.Map;

import iot.project.smart_baby.model.Member;

public interface MemberDao extends CrudDao<Member, String>{
	
//	추가 개발용
//	Member findByParName(String parName) throws Exception;	: ID 찾기
//	int changePassword(Map<String, String> map) throws Exception;	: 비밀번호 변경

}
