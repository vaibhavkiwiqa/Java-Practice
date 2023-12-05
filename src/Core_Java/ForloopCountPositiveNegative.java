package Core_Java;

import java.util.Scanner;

public class ForloopCountPositiveNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number");
		int num = s.nextInt();
		int even =0;
		int odd =0;
		
		for(int i=1;i<=num;i++) {
			
			if(i%2==0)
				
				even = i++;
				
				
	
				
		}
		System.out.println(even);
	}

}
