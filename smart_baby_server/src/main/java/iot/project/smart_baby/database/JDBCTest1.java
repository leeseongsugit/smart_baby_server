package iot.project.smart_baby.database;

// JDBC 드라이버 로드 테스트
public class JDBCTest1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 JDBC 드라이버 로드 테스트 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
