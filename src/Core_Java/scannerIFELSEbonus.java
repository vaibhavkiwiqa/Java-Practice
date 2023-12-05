package Core_Java;

import java.util.Scanner;

public class scannerIFELSEbonus {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Year of service");
		int ys = s.nextInt();
		
		System.out.print("Salary");
		int salary = s.nextInt();
		int bonus = salary*5/100;
		
		if(ys>=5) {
			
			System.out.println(bonus);
		}
        
		else {
			
			System.out.println("No bonus");
		}
	}

}
