package JavaBasics;

public class StaticArray {

	public static void main(String[] args) {
		
		//array : to store similar data type value in a array variable 
		
		//1.int array:
		int i[] = new int [4];
		//lowest bound/index =0;
		//upper bound /index = n -1;
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//array index out of bounds exception 
		System.out.println(i.length);
		
		//print all the values of array : use for loop
		for (int j =0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//double array 
		double d[] = new double [3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		//char array 
		char c[] = new char [3];
		c[0] = 'q';
		c[1] = 2;
		c[2] = '$';
		
		//boolean array 
		boolean b[] = new boolean [2];
		b[0] = true;
		b[1] = false;
		
		
		//string array 
		
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "hello";
		s[2] = "world";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//one dim array 
		//dis -advantage of array 
		//1.size is fixed -- static array = to overcome the problem - we use collection --array list ,hash table ,use dynamic array;
		//2.stores only similar data type --to overcome of this problem we use object array 
		
		//object array :(object is class) 
		Object ob []  = new Object [6];
		ob[0] ="tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1994";
		ob[4] = 'M';
		ob[5] = "london";
		
		//object -- is used to store different data type values
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		
		
		

	}

}
