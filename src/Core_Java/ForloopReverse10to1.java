package Core_Java;

import java.util.Scanner;

public class ForloopReverse10to1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number");
		int num = s.nextInt();
		
		for(int i=10;i>=num;i--) {
			
			System.out.println(i);
		}

	}

}
