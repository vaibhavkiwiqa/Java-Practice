package Inheritance;

public class Schooladmin extends school {

	public static void main(String[] args) {
		int b = 13;
		Schooladmin.openAdmission();
		Schooladmin sl = new Schooladmin();
		sl.closeAdmission();
		sl.admission1();
		sl.openAdmission();
		admission();
		System.out.println(b);
		
	}

	
	public static void openAdmission() {
		
		System.out.println("OpenAdmission");
		Schooladmin sl1 = new Schooladmin();
		sl1.closeAdmission();
		
		
		
	}
	
	public void closeAdmission() {
		
		System.out.println("CloseAdmission");
		
	}
}
