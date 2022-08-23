package OOPSConcept;

public class LocalvsGlobalVariable {

	//global vars -- class variable 
	String name ="nani";
	int age = 25;
	
	
	public static void main(String[] args) {
	
	int i = 20;
	System.out.println(i);
		
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable ();
		
		System.out.println(obj.name);
		System.out.println(obj.age);

		
		

	}
}
