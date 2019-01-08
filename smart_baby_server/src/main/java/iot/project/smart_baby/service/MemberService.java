package iot.project.smart_baby.service;

import iot.project.smart_baby.model.Member;

public interface MemberService {
	Member login(String userId, String password) throws Exception;
	
	void join(Member member) throws Exception;
	
	public String idcheck(String userId) throws Exception;
	
	Member findById(String userId) throws Exception;
	
	void delete(String userId) throws Exception;

}
