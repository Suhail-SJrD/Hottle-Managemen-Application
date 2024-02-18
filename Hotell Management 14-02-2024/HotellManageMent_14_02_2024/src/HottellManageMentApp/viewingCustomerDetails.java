package HottellManageMentApp;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class viewingCustomerDetails
{
	Date dt = new Date();
	Scanner sc = new Scanner(System.in);
	public void GetAllotedRoomsCustomerDetails(HashMap map) {
		System.out.println("Eneter the Room Number to Check the Customer Details");
		Integer CheckingRoomNumber = sc.nextInt();
		if(map.containsKey(CheckingRoomNumber)) {
			CustomerDetails cs2 = (CustomerDetails) map.get(CheckingRoomNumber);
			System.out.println("Name : "+cs2.getCustomerName());
			System.out.println("Staying Resone : "+cs2.getCustomerStayingReson());
			System.out.println("Age : "+cs2.getCustomerAge());
			System.out.println("Distric : "+cs2.getDistric());
			System.out.println("Comming From : "+cs2.getCustomerCommingFrom());
			System.out.println("Native Place : "+cs2.getCustomerNative());
			System.out.println("Check In Date : " + cs2.getChecking_Date());
			System.out.println("Check Out Date : " + cs2.getCheckOut_Date());
		}
		else {
			System.err.println("Invalid Room Number");
			System.out.println("Try again");
		}
	}
	
}
