package iot.project.smart_baby.database;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//database.properties 파일을 읽어 DB 접속 테스트 : DB에 연결
public class Database {  
	private static Connection connection;  
	static {   
		try {    
			Properties properties  = new Properties();    
			String path = Database.class.getResource(           
					"/database.properties").getPath();    
			properties.load(new FileReader(path));    
			String driver = properties.getProperty("driver");    
			String url = properties.getProperty("url");    
			String username = properties.getProperty("username");    
			String password = properties.getProperty("password");        
			Class.forName(driver);       
			connection = (Connection) DriverManager.getConnection(            
					url, username, password);   
		} catch (Exception e) {    
			e.printStackTrace();   
		}  
	}
	public static Connection getConnection() {   
		return connection;  
	}    
	public static void close() {   
		if(connection!= null) {    
			try {     
				connection.close();    
			} catch (SQLException e) {     
				e.printStackTrace();    
			}   
		}  
	}  
}