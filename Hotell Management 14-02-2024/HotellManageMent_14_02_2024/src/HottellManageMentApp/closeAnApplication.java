package HottellManageMentApp;

import java.util.Date;
import java.util.Scanner;

public class closeAnApplication{
	
	Date dt = new Date();
	Scanner sc = new Scanner(System.in);
	
	public void CloseTheAplication() {
		System.out.println("-------Sayyid Group Stay's-------");
		System.out.println("Have a Safe Journy");
		System.out.println("Come again");
		System.out.println("Application is Closed at : " + dt );
		System.exit(0);
	}
	
}
