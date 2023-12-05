package String_Method;


public class DifferentMethodString {

	public static void main(String[] args) {
		
    String sen = "This is Java automation";
    String word = "Selenium";
    
    String upper = sen.toUpperCase();
    System.out.println(upper);
    
    String lower = sen.toLowerCase();
    System.out.println(lower);
    
    String word1 = sen.substring(8, 12);
    System.out.println(word1);
    
    String trm = sen.trim();
    System.out.println(trm);
    
   String pyt = sen.replace("Java","Python");
   System.out.println(pyt);
    
    char char1 = sen.charAt(5);
    System.out.println(char1);
    
    char[] arr = sen.toCharArray();
    System.out.println(arr);
    
    int len = sen.length();
    System.out.println(len);
    
   
  }
	}


