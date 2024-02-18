package HottellManageMentApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import java.util.Scanner;

public class totalSalesForADay{

	Date dt = new Date();
	Scanner sc = new Scanner(System.in);
	
	public void TotalSalesForADay(ArrayList Sales) {
		
		ListIterator itr = Sales.listIterator();
		
		double TotalSaleForTheDay = 0.0;
		while(itr.hasNext())
		{
			TotalSaleForTheDay = TotalSaleForTheDay + (double)itr.next();
		}
		
		System.out.println("Total Sales for this Day is : "+TotalSaleForTheDay);
	}
	
}
