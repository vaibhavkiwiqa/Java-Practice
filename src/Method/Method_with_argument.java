package Method;

public class Method_with_argument {

	public static void main(String[] args) {
		
		methodargument("JBL");
		registration("test1@gmail.com",123456);
		registration("test2@gmail.com",123456);

	}
   public static void methodargument(String name) {
	   
	   System.out.println("Headphone "+ name);
   }
   
   public static void registration(String email,int password) {
	   
	   
	   System.out.println("Enter email:"+ email);
	   System.out.println("Enter password:"+ password);
   }
}
