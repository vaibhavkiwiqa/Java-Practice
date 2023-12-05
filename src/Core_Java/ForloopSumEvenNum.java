package Core_Java;

import java.util.Scanner;

public class ForloopSumEvenNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number");
		int num = s.nextInt();
		int total=0;
		
		
		
		for(int i=1;i<=num;i++) {
			
			
			if(i%2==0)
				
				total =total+i;
				
				
			}
		System.out.println(total);
		
	}

}
