package Core_Java;

import java.util.Scanner;

public class scannerIFELSE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value A:");
		int A = s.nextInt();
		
	    System.out.print("Enter the value B:");
		int B = s.nextInt();
		
		System.out.print("Enter the value c:");
		int C = s.nextInt();
		
		
		if(A>B && A>C) {
			
			System.out.println(A+" "+ "is greatest number");
		}
		
		else if(B>C && B>A) {
			
			System.out.println(B+" " + "is greatest number");
		}
		
		else
			
			System.out.println(C+" "+ "is greatest number");
	}

}
