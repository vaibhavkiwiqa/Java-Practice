package Method;

public class Return_Method1 {
	static int total;
	public static void add(int x,int y) {
		total= x+y;
	}
	
	public static String compare() {
		
		if(total>100) {
			
			return "yes";
			
			
		}
		else {
			
			return "no";
		}
		
	}

	public static void main(String[] args) {
	
		
		add(103, 3);
		String ans=compare();
		System.out.println(ans);

	}

}
