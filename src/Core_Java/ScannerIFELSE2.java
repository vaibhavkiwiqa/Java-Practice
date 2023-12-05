package Core_Java;

import java.util.Scanner;

public class ScannerIFELSE2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Carrot qty");
		int c1 = s.nextInt();
		
		System.out.print("Onion qty");
		int o1 = s.nextInt();
		
		System.out.print("Mean qty");
		int m1 =s.nextInt();
		
		System.out.println("Enter Payment Method");
		String paymentOption = s.next();
		
		int carrots = 2;
		int onions = 4;
		int meats = 10;
		float totalMult = c1*carrots +o1*onions+m1*meats;
		float totalDiv = ((totalMult*13)/100)+totalMult; 
				
		if(paymentOption.contains("Card")) {
			System.out.println(totalDiv);			
		}
		else
		{
			System.out.println(totalMult);
		}
}
	
}
