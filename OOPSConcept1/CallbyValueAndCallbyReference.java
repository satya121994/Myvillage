package OOPSConcept1;

public class CallbyValueAndCallbyReference {
	
	int p;
	int q;
	

	public static void main(String[] args) {
		
		
		CallbyValueAndCallbyReference obj = new CallbyValueAndCallbyReference();
		int x = 10;
		int y = 20;
		
		obj.testsum(x, y);//call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		//diff b/w CallbyValueAndCallbyReference is the possible ?
		//yes 
		
		
	}

	public int testsum(int a,int b) {
		a =30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	public void swap(CallbyValueAndCallbyReference t) {
		int temp ;
		temp = t.p;
		t.p = t.q;
		t.q =temp;
	}
	
	
	
	
}
