package Core_Java;

public class Objectarray {

	public static void main(String[] args) {
		
		Object arr[] = new Object[5];
		arr[0]= 1;
		arr[1]= "Test1";
		arr[2]= 44.34;
		arr[3]= 'U';
		arr[4]= true;
		
		
		for(int i = 0;i<5;i++) {
			
			System.out.println(arr[i]);
		}
		

	}

}
