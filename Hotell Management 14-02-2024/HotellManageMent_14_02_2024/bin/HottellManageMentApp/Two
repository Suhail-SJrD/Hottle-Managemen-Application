package HottellManageMentApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class UpcasingOfHottelFuncnalities {


	static CustomerDetails objectCommunication = null;
	

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		HashMap map = new HashMap();
		ArrayList ar = new ArrayList();
		ArrayList Sales = new ArrayList();
		CustomerDetails cs = new CustomerDetails();
		
		// Achiving Full Abstraction
		allHottelNecessaryFuncnality rs = new implementingAllHottelFuncnalites();
		rs.TotalRoomsInAHotell(ar);
		
		
		
		while(true) {
			
			System.out.println("-------Welcome to Sayyid Group Stay's-------");
			System.out.println("Hear Available Premum Service's Are:->");
			System.out.println("1.Available Rooms");
			System.out.println("2.Booked Rooms");
			System.out.println("3.Booke a Room");
			System.out.println("4.Check the Room Details");
			System.out.println("5.Checking Out the Room");
			System.out.println("6.Total Sales For the Day");
			System.out.println("7.Close the Application");
			System.out.println("How May Help you!!!");
			
			System.out.println("\nSelect the Give Service Which is Sutable to you!!!");
			
			int Options = scanner.nextInt();
			int checkingSwitchCase = 0;
			switch(Options) 
			{
			
			case 1: rs.AvailableRooms(map, ar); break;
			case 2: rs.BookedRooms(map); break;
			case 3: objectCommunication = rs.GetCustomerDetailsToAllocatRoom_s(map,ar,Sales); checkingSwitchCase = 3; break;
			case 4: rs.GetAllotedRoomsCustomerDetails(map); break;
			case 5: rs.CustomerCheckOut(map); break;
			case 6: rs.TotalSalesForADay(Sales);break;
			case 7: rs.CloseTheAplication(); break;
			default:
				System.err.println("Invalid Option Check Once and Try again");
				break;
			}
			
			
			
			if(checkingSwitchCase==3) {
				if(!(objectCommunication==null )) {
					
					System.out.println("enterted");
					hottelManagementProjectDataBaseConnection.DatabaseConnection();	
					objectCommunication = null;
				
				}
				else {
					System.err.println("Data is not Stored in Data Base!!!");
					System.err.println("Apologise for inconvenient Do the Operation Again!!");
				}
			}
			
			System.out.println("\n");
		}
		

		
	}
	
}
