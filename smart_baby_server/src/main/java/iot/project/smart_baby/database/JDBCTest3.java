package iot.project.smart_baby.database;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

// database.properties 파일을 읽어 DB 접속 테스트 : 파일 읽기
public class JDBCTest3 {

	public static void main(String[] args) {
		
		try {
			Properties properties = new Properties();
			String path = JDBCTest3.class.getResource(
					"/database.properties").getPath();
			properties.load(new FileReader(path));
			String driver = properties.getProperty("driver");    
			String url = properties.getProperty("url");    
			String username = properties.getProperty("username");    
			String password = properties.getProperty("password");     
			System.out.println(driver); 
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}


