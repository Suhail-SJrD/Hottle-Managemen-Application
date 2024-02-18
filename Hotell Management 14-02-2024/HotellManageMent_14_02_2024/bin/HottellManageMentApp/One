package HottellManageMentApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Date;

public class implementingAllHottelFuncnalites implements allHottelNecessaryFuncnality
{
	/*
	(
		String customerName,
		String customerStayingReson, 
		int customerAge, 
		String customerNative,
		String customerCommingFrom, 
		String distric
	)	
	 */

	Date dt = new Date();
	Scanner sc = new Scanner(System.in);
	public CustomerDetails GetCustomerDetailsToAllocatRoom_s(HashMap map, ArrayList ar,ArrayList Sales) 
	{
		
		CustomerDetails objectOfCustomerDetailsClass = new CustomerDetails();
		Double RoomRentPerDay = 1000.00;

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
		

		objectOfCustomerDetailsClass.setDistric(Distric);
		objectOfCustomerDetailsClass.setCustomerName(CustomerName);
		objectOfCustomerDetailsClass.setCustomerStayingReson(CustomerStayingReson);
		objectOfCustomerDetailsClass.setCustomerAge(CustomerAge);
		objectOfCustomerDetailsClass.setCustomerNative(CustomerNative);
		objectOfCustomerDetailsClass.setCustomerCommingFrom(CustomerCommingFrom);
		objectOfCustomerDetailsClass.setChecking_Date(dt);

		
		
		
		
		System.out.println("Eneter the room Number");
		int RoomNo = sc.nextInt();
		int StayingDays = 1;
		boolean flag = CheckingTheRoomValidation(ar,RoomNo);
		boolean WhileLoopFlag = true;
		if(!(map.containsKey(RoomNo))) {
			while(WhileLoopFlag) {
				
				if(flag) {
					map.put(RoomNo,objectOfCustomerDetailsClass);
					objectOfCustomerDetailsClass.setRoomNumber(RoomNo);
					System.out.println("How many Days You Want the Room ");
					StayingDays = sc.nextInt();
					while(true) {
						if(StayingDays > 0) {
							Sales.add(RoomRentPerDay*StayingDays);
							break;
						}
						else {
							System.err.println("Try Again by giving greater thean 0 (>0) ");
							System.out.println("How many Days You Want the Room ");
							StayingDays = sc.nextInt();
						}
					}
					WhileLoopFlag = false;
				}
				else {
					System.err.println("Invalid Room No:-");
					System.err.println("You want to Continue with this Funcnality yes or Not");
					String CheckingWillingNess = sc.next();
					if(CheckingWillingNess.equals("yes")) {
						System.out.println("Eneter the room Number");
						RoomNo = sc.nextInt();
						flag = CheckingTheRoomValidation(ar,RoomNo);
					}
				}
			}
			System.out.println("------------->Room Rent Billing Amount<-------------");
			System.out.println("Time When the Bill was Generated : " + dt);
			System.err.println("Mr/Mss. " + objectOfCustomerDetailsClass.getCustomerName()  + "Room Alloted Successfully");
			System.out.println("Per Day Room Rent is : " + RoomRentPerDay);
			System.out.println("Your Are Stalying her for " + StayingDays);
			System.out.println("Days Multiplyed by the Room Rent = "  + RoomRentPerDay*StayingDays);
			objectOfCustomerDetailsClass.setTotalAmount(RoomRentPerDay*StayingDays);
			objectOfCustomerDetailsClass.setDays(StayingDays);
			System.out.println("Mr/Mss. " + objectOfCustomerDetailsClass.getCustomerName() + " your Total Amount is " + RoomRentPerDay*StayingDays );
		}
		else {
			System.out.println("Alrady This Room is Occupied try other's");
		}
		return objectOfCustomerDetailsClass;
	}
	
	public boolean CheckingTheRoomValidation(ArrayList ar,int RoomNo) {
		ListIterator itr = ar.listIterator();
		while(itr.hasNext()) {
			if(RoomNo == (int)itr.next()) {
				return true;
			}
		}
		return false;
	}
		
	public void GetAllotedRoomsCustomerDetails(HashMap map) {
		System.out.println("Eneter the Room Number to Check the Customer Details");
		Integer CheckingRoomNumber = sc.nextInt();
		if(map.containsKey(CheckingRoomNumber)) {
			CustomerDetails cs2 = (CustomerDetails) map.get(CheckingRoomNumber);
			System.out.println("Name : "+cs2.getCustomerName());
			System.out.println("Staying Resone : "+cs2.getCustomerStayingReson());
			System.out.println("Age : "+cs2.getCustomerAge());
			System.out.println("District : "+cs2.getDistric());
			System.out.println("Comming From : "+cs2.getCustomerCommingFrom());
			System.out.println("Native Place : "+cs2.getCustomerNative());
			System.out.println("Check In Date : " + cs2.getChecking_Date());
			cs2.setCheckOut_Date(dt);
			System.out.println("Check Out Date : " + cs2.getCheckOut_Date());
		}
		else {
			System.err.println("Invalid Room Number");
			System.out.println("Try again");
		}
	}
	
	
	public void BookedRooms(HashMap map)
	{
		
		Set st = map.keySet();
		Iterator itr = st.iterator();
		if(itr.hasNext()) {
			System.out.println("Booked Rooms Are : ");
			while(itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
		}
		else {
			System.out.println("No Room is Booked Count = " + 0 );
		}
		
		
	}
	
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
			System.err.println("Invalid Room Number:-");
			System.err.println("You want to Continue with this Fnctionality Yes or Not");
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
		System.out.println("Checked In : " + StoringCustomerCheckingOutDetails.getChecking_Date() );
		System.out.println("Check Out : " + CheckOut);
		
		
	}
	
	public void AvailableRooms(HashMap map,ArrayList ar)
	{
		ListIterator itr = ar.listIterator();
		Set Key_sStoring = map.keySet();
		Iterator MapItr = Key_sStoring.iterator();
		if(MapItr.hasNext()) {
			System.out.println("\nAvailable Rooms Are : ");
			while(itr.hasNext()) {
				Object TempStorageOfTheNextElement = itr.next();
				if(!(map.containsKey(TempStorageOfTheNextElement))) {
					System.out.print(TempStorageOfTheNextElement + " ");
				}
			}
			System.out.println();
		}
		else
		{
			System.out.println("Available Rooms Are :-> ");
			while(itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public void TotalSalesForADay(ArrayList Sales) {
		
		ListIterator itr = Sales.listIterator();
		
		double TotalSaleForTheDay = 0.0;
		while(itr.hasNext())
		{
			TotalSaleForTheDay = TotalSaleForTheDay + (double)itr.next();
		}
		
		System.out.println("Total Sales for this Day is : "+TotalSaleForTheDay);
	}
	
	
	public void TotalRoomsInAHotell(ArrayList ar) {
		for(int i = 101; i<= 105; i++) {
			ar.add(i);
		}
	}
	
	public void CloseTheAplication() {
		System.out.println("-------Sayyid Group Stay's-------");
		System.out.println("Have a Safe Journy");
		System.out.println("Come again");
		System.err.println("Application is Closed at : " + dt );
		System.exit(0);
	}	
}
