package HottellManageMentApp;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class checkingOutACustomer{

	Date dt = new Date();
	Scanner sc = new Scanner(System.in);
	
	
	public void CustomerCheckOut(HashMap map) {
		System.out.println("Enter the Room Number To Check Out:-> ");
		int RoomNumberToCheckOut = sc.nextInt();
		CustomerDetails StoringCustomerCheckingOutDetails = null;
		String Name = "";
		String StayingReson= "";
		int Age = 0;
		String NativePlace = "";
		String Comming_From = "";
		String Distric = "";
		Date CheckOut = null;
		
		
		try {
			StoringCustomerCheckingOutDetails = (CustomerDetails) map.remove(RoomNumberToCheckOut);
			Name = StoringCustomerCheckingOutDetails.getCustomerName();
			StayingReson = StoringCustomerCheckingOutDetails.getCustomerStayingReson();
			Age = StoringCustomerCheckingOutDetails.getCustomerAge();
			NativePlace = StoringCustomerCheckingOutDetails.getCustomerNative();
			Comming_From = StoringCustomerCheckingOutDetails.getCustomerCommingFrom();
			Distric = StoringCustomerCheckingOutDetails.getDistric();
			StoringCustomerCheckingOutDetails.setCheckOut_Date(dt);
			CheckOut = StoringCustomerCheckingOutDetails.getCheckOut_Date();
			
		}
		catch(NullPointerException ExceptionCatcingObject) {
			System.out.println("Enter the Valid Room Number:->");
			System.err.println("Invalid Room No:-");
			System.err.println("You want to Continue with this Funcnality yes or Not");
			String CheckingWillingNess = sc.next();
			if(CheckingWillingNess == "yes") {
				CustomerCheckOut(map);
				return;
			}
			else {
				return;
			}
		}
		System.out.println("Name : " + Name);
		System.out.println("Staying Resone : " + StayingReson);
		System.out.println("Age : " + Age);
		System.out.println("Native Place : " + NativePlace);
		System.out.println("Comming From : " + Comming_From);
		System.out.println("Distric : " + Distric);
		System.out.println("Check Out : " + CheckOut);
		
		
	}
	
}
