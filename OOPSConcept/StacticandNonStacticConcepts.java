package OOPSConcept;

public class StacticandNonStacticConcepts {

	String name = "Satya";
	static int age = 25;
	
	
	
	public static void main(String[] args) {
		
		//how to call static methods and vars
		//1.direct calling
		
		sum();
		
		//calling by classname
		StacticandNonStacticConcepts.sum();
		
		System.out.println(age);
		System.out.println(StacticandNonStacticConcepts.age);
		
		//how to call non static methods and vars 
		StacticandNonStacticConcepts obj = new StacticandNonStacticConcepts();
		obj.sendmail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference ?yes
		
		obj.sum();
		
		//global vars : the scope of global vars will be available across all the functions with same conditions
		
		
		
		
		
		
		
	}

	public void sendmail() {//non static method
		System.out.println("send mail method");
	}
	
	public static void sum () {
		System.out.println("sum method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
