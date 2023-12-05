package Method;

public class Simple_Method {

	public static void main(String[] args) {
		
     System.out.println("Simple Main method");
     simplemethod();
     
	}
  public static void simplemethod() {
	  
	  System.out.println("Simple method1");
	  simplemethod1();
  }
  
  public static void simplemethod1() {
	  
	  System.out.println("Simple method2");
  }
}
