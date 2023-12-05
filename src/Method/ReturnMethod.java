package Method;

public class ReturnMethod {
	
	public static String compareNumber(int x,int y) {
		
		if(x>y) {
			
			return "X is big.";
		}
		else {
			
			return "Y is big.";
		}
		
	}

	public static void main(String[] args) {
		
		
		String res=compareNumber(8, 10);
		System.out.println(res);
		

	}
	
	

}
