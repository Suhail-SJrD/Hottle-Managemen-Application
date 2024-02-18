package HottellManageMentApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class viewingAvailableRooms{

	Date dt = new Date();
	Scanner sc = new Scanner(System.in);
	
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
			System.out.println("Availablle Rooms Are :-> ");
			while(itr.hasNext()) {
				System.out.print(itr.next() + " : ");
			}
			System.out.println();
		}
		
		
	}
	
}
