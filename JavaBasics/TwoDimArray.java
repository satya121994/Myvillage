package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		
		String x [][] = new String[3][5];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		//1 st array 
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "c";
		x[0][3] = "D";
		x[0][4] = "E";

		//2nd row 
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		//3.3rd row 
		x[2][0] ="A2";
		x[2][1] = "B2";
		x[2][2] ="C2";
		x[2][3] = "D2";
		x[2][4] ="E2";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		//print all the values of 2d array : we use for loop
		
		//row = 0 ,col  = 0 to 4
		//row = 1,col  = 0 to 4
		//row = 2 ,col = 0 to 4
		
		for(int row = 0;row <x.length;row ++) {
			for (int col =0;col <x[0].length;col ++) {
				System.out.println(x[row][col]);
			}
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static Object x(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
