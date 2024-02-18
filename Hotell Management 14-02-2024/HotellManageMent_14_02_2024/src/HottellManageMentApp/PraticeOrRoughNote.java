package HottellManageMentApp;

import java.util.HashMap;
import java.util.Scanner;

public class PraticeOrRoughNote 
{
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		HashMap h = new HashMap();
		h.put(10, i);
		System.out.println(h.values());
	}
	
}
