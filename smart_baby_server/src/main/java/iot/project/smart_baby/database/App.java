package iot.project.smart_baby.database;

import org.apache.ibatis.session.SqlSession;

public class App {

	public static void main(String[] args) {
		
		SqlSession session = Session.getSession();      
		System.out.println("MyBatis 준비 완료");   
		session.close(); 
	}
}