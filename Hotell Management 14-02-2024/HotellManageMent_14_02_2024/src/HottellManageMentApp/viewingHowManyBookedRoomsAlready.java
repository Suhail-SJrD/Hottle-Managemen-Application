package HottellManageMentApp;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class viewingHowManyBookedRoomsAlready{

	Date dt = new Date();
	Scanner sc = new Scanner(System.in);
	
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
			System.out.println("No Romm is Booked count = " + 0 );
		}
		
		
	}
	
}
