package Core_Java;

import java.util.Scanner;

public class scannerIFELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.println("Enter value");
      double num = s.nextDouble();
      
      if(num > 0) {
    	  
    	  System.out.println(num+" " +"is positive number");
    	  
      }
      else if(num < 0) {
    	  
    	  System.out.println(num+" " +"is negative number");
      }
      else
    	  
    	  System.out.println("Number is zero");
		
	}

}
