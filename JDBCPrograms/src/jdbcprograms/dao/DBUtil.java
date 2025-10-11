package jdbcprograms.dao;

import java.sql.*;
import javax.sql.*;

public class DBUtil {

	private static Connection con;
	private static final String Driver="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Anirudh@719";
	private static final String URL ="jdbc:mysql://localhost:3306/db";
	
	public static Connection getConnection() {
		try {
			Class.forName(Driver);
			System.out.println("Driver loaded successfully");
			
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("connnection Established");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
}
