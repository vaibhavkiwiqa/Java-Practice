package Core_Java;

public class TwoDimensionAraay {

	public static void main(String[] args) {
		String data[][] = new String[3][3];
		data[0][0] = "A";
		data[0][1] = "B";
		data[0][2] = "c";
		data[1][0] = "D";
		data[1][1] = "E";
		data[1][2] = "F";
		data[2][0] = "G";
		data[2][1] = "H";
		data[2][2] = "I";
		
		for(int row=0;row<3;row++) {
			
			for(int col=0;col<3;col++) {
				
				System.out.println(data[row][col]);
			}
		}

	}

}
