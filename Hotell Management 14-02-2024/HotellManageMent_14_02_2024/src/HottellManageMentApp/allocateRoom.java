package HottellManageMentApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;

public class allocateRoom{
	Date dt = new Date();
	Scanner sc = new Scanner(System.in);
	public void GetCustomerDetailsToAllocatRoom_s(HashMap map, ArrayList ar,ArrayList Sales) 
	{
		
		CustomerDetails objectOfCustomerDetailsClass = new CustomerDetails();
		Double RoomRentPerDay = 1000.00;

		System.out.println("Enter your Name");
		String CustomerName = sc.next();
		System.out.println("StayingRsone");
		String CustomerStayingReson = sc.next();
		System.out.println("Your Age");
		int CustomerAge = sc.nextInt();
		System.out.println("your District");
		String Distric = sc.next();
		System.out.println("Native");
		String CustomerNative = sc.next();
		System.out.println("Your Comming From");
		String CustomerCommingFrom = sc.next();
		

		objectOfCustomerDetailsClass.setDistric(Distric);
		objectOfCustomerDetailsClass.setCustomerName(CustomerName);
		objectOfCustomerDetailsClass.setCustomerStayingReson(CustomerStayingReson);
		objectOfCustomerDetailsClass.setCustomerAge(CustomerAge);
		objectOfCustomerDetailsClass.setCustomerNative(CustomerNative);
		objectOfCustomerDetailsClass.setCustomerCommingFrom(CustomerCommingFrom);
		objectOfCustomerDetailsClass.setChecking_Date(dt);

		
		
		
		
		System.out.println("Eneter the room Number");
		int RoomNo = sc.nextInt();
		boolean flag = CheckingTheRoomValidation(ar,RoomNo);
		boolean WhileLoopFlag = true;
		if(!(map.containsKey(RoomNo))) {
			while(WhileLoopFlag) {
				
				if(flag) {
					map.put(RoomNo,objectOfCustomerDetailsClass);
					System.out.println("How many Days ");
					int StayingDays = sc.nextInt();
					if(StayingDays > 0) {
						Sales.add(RoomRentPerDay*StayingDays);
					}
					WhileLoopFlag = false;
				}
				else {
					System.err.println("Invalid Room No:-");
					System.err.println("You want to Continue with this Funcnality yes or Not");
					String CheckingWillingNess = sc.next();
					if(CheckingWillingNess == "yes") {
						System.out.println("Eneter the room Number");
						RoomNo = sc.nextInt();
						flag = CheckingTheRoomValidation(ar,RoomNo);
					}
					else {
						return;
					}
				}
			}
		}
		else {
			System.out.println("Alrady This Room is Occupied try other's");
		}
	}
	
	boolean CheckingTheRoomValidation(ArrayList ar,int RoomNo) {
		ListIterator itr = ar.listIterator();
		while(itr.hasNext()) {
			if(RoomNo == (int)itr.next()) {
				return true;
			}
		}
		return false;
	}
}
