package Core_Java;

import java.util.Scanner;

public class while1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter value");
		int x = s.nextInt();
		
		while(x<=15) {
			
			System.out.println(x);
			x++;
		}
	}

}
