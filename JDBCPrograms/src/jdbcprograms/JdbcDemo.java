package jdbcprograms;
import java.sql.*;
import javax.sql.*;



public class JdbcDemo {

	public static void main(String[] args) throws Exception{
		
		String URL ="jdbc:mysql://localhost:3306/db";
		String USER = "root";
		String PASSWORD = "Anirudh@719";
		//step1:- load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("The Driver is loaded succesfully");
        
        
        //step2:- Establishing the connection
        Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
        System.out.println("Connection Established");
        
        //step:- statement creation
        Statement st = con.createStatement();
        
        //step:- Execute Query
        st.executeUpdate("CREATE TABLE students(sid int,sname varchar(20))");
        System.out.println("Table created");
        
        st.close();
        con.close();
        
	}

}
