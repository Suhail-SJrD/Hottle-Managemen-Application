package HottellManageMentApp;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Connection;

public class hottelManagementProjectDataBaseConnection {
	
	/*
	 	System.out.println("Enter your Name : ");
		String CustomerName = sc.next();
		System.out.println("Your Age : ");
		int CustomerAge = sc.nextInt();
		System.out.println("Staying Reason : ");
		String CustomerStayingReson = sc.next();
		System.out.println("your District : ");
		String Distric = sc.next();
		System.out.println("Native : ");
		String CustomerNative = sc.next();
		System.out.println("Your Comming From : ");
		String CustomerCommingFrom = sc.next();
		Checkout and Checkin,Rent total amount
	 */
	Date dt = new Date();

		public static void DatabaseConnection() {
			
			
			//Object Creation Concept Using Upcasting
			CustomerDetails storingObjectOfCustomerDetails = UpcasingOfHottelFuncnalities.objectCommunication;
			String CheckInString = ""+storingObjectOfCustomerDetails.getChecking_Date();
			String CheckOutString = ""+storingObjectOfCustomerDetails.getCheckOut_Date();
			
			Connection con = null;
			PreparedStatement prs = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
				
				
				//Creating Table Once Only not twice
				/*
					String createTable = "create table hottlemanagementsystemprojecttable.HottelManagementTable ( id int auto_increment primary key,name varchar(20),Age int(4),stayingReason varchar(30),District varchar(20),Villagenative varchar(20),CommingFrom varchar(30))";
					PreparedStatement prs = con.prepareStatement(createTable);
					int countOfInsertingQuery =  prs.executeUpdate();
					System.out.println(countOfInsertingQuery);
				*/
				
				String queryToInsertTheData = "insert into hottlemanagementsystemprojecttable.HottelManagementTable(name,Age,stayingReason,District,Villagenative,CommingFrom,CheckIn,CheckOut,Amount,Days) values (?,?,?,?,?,?,?,?,?,?)";
				prs = con.prepareStatement(queryToInsertTheData);
				prs.setString(1, storingObjectOfCustomerDetails.getCustomerName());
				prs.setInt(2, storingObjectOfCustomerDetails.getCustomerAge());
				prs.setString(3, storingObjectOfCustomerDetails.getCustomerStayingReson());
				prs.setString(4, storingObjectOfCustomerDetails.getDistric());
				prs.setString(5, storingObjectOfCustomerDetails.getCustomerNative());
				prs.setString(6, storingObjectOfCustomerDetails.getCustomerCommingFrom());
				prs.setString(7,CheckInString);
				prs.setString(8, CheckOutString);
				prs.setInt(9, (int)storingObjectOfCustomerDetails.getTotalAmount());
				prs.setInt(10, storingObjectOfCustomerDetails.getDays());
				
				
				
				int updateQueryCount = prs.executeUpdate();
				System.err.println("Number of Query updated in Hottel Management Table = " + updateQueryCount);
				
				
			}
			catch(ClassNotFoundException | SQLException ExceptionThrowsObject) {
				ExceptionThrowsObject.printStackTrace();
			}
			finally {
				if(prs!=null) {
					try {
						prs.close();
					}
					catch(Exception prsException) {
						prsException.printStackTrace();
					}
				}
				if(con!=null) {
					try {
						prs.close();
					}
					catch(Exception prsException) {
						prsException.printStackTrace();
					}
				}
			}
			
		}
	
}
