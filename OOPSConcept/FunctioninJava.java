package OOPSConcept;

public class FunctioninJava {

	//main --- method --->starting point of execution
	public static void main(String[] args) {
		
		FunctioninJava obj = new FunctioninJava ();
		
		//one object will be created ,obj is the reference variable refering to this object
		//after creating the object ,the copy of all non -static methods will be given to this object
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 =obj.qa();
		System.out.println(s1);
		
		int div = obj .division(40, 2);
		System.out.println(div);
		
	//main method is void -- never return a value 
		//return means come out of some output
		
		
		
		
	}

	//non static methods 
	
	//return type - void
	//void means does  not return any value 
	public void test () { //no input no output 
		System.out.println(" test method ");
	}
	
	//return type - int
	public int pqr () { //no input ,some  output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
		
	}
	
	//return type -- string
	public String qa () {
		System.out.println("qa method");
		String s = "selenium";
		return s;
		
		
	}
	
	//return type --int
	//x,y --input parameters/arguments
	public int division (int x,int y ) {
		System.out.println("division method");
		
		int d = x/y;
		return d;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
