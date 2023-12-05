package Core_Java;

import java.util.Scanner;

public class scannerIFELSE3 {

	public static void main(String[] args) {
		
		int unit = 100;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter Qty:");
		 int qty = s.nextInt();
		 int total= qty*unit;
		 
		 if (total >1000) {
			 
			 System.out.println("your amount will be"+ " " + (total-(total*10)/100));
		 }
		 else {
			 
			 System.out.println("Your amount will be"+ " "+ total);
		 }
	}

}
