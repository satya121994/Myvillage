package OOPSConcept;

public class MethodOverloading {

	public static void main(String[] args) {
	
		//method overloading -> when the method name is same with different arguments or input parameters within the same class
		
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum ();
		obj.sum(10);
		obj.sum(10,5);
		
		//we can overload main method also
		//you can not create a method inside a method
		//duplicate methods -->same method name with same number of arguments are not allowed
		
		

		
	}

	public void sum () {
		System.out.println("sum method -----zero param");
	}
	
	public void sum (int i) {
		System.out.println("sum method ---one parameters");
		System.out.println(i);
	}
	
	public void sum (int k ,int l) {
		System.out.println("sum method --- two parameters");
		System.out.println(k+l);
	}
	
	
	public void sum (double d) {
		System.out.println("sum method - 1 input parameters");
	}
	
	public static void main (int q ,int h) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
