package iot.project.smart_baby.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터베이스 연결 테스트
public class JDBCTest2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		try(Connection conn = 
				(Connection) DriverManager.getConnection(url, "smartbaby", "smartbaby")){
			System.out.println("DB connection success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
