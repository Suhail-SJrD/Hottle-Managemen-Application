package HottellManageMentApp;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import java.sql.Connection;

public class playGround{

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("conneted");
		
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("hia");
		}
		 
		
	}
	
}
