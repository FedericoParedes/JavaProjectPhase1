package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface MySQLDBConnection {

	default Connection getConnection(){
		
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String URL = "jdbc:mysql://localhost:3306/movies";
		
		Connection conexion = null;
		
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(URL, "root", "030818");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
		 return conexion;
			
			
		}	
	
	
}
