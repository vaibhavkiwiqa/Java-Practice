package Core_Java;

import java.util.Scanner;

public class Forloop1to10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = s.nextInt();
		
		for(int i =1;i<=num;i++) {
			
			System.out.println(i);
		}

	}

}
