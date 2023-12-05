package Core_Java;

import java.util.Scanner;

public class ForloopFactorialNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number");
		int num = s.nextInt();
		int total=1;
		
		
		
		for(int i=1;i<=num;i++) {
			
				
				total =total*i;
				
				
			}
		System.out.println(total);
		

	}

}
