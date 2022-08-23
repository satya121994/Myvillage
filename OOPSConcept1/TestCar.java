package OOPSConcept1;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW ();
		
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		//polymorphism means one to many methods 
		
		//it means method overridden
		
		System.out.println("--------------");
		
		Car c = new Car ();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("---------------");
		
		//top coasting 
		Car c1 = new BMW ();
		//child class object can be referred by parent class reference variable --dynamic polymporyhism ->run time polymporphism
		
		c1.start();
		c1.stop();
		c1.refuel();
		
		//down coasting
		BMW b1 = (BMW) new Car ();//class cast exception
		
		//what is diff top casting and down casting 
		//Top coasting means dynamic polymorphism .child class object can be refered by parent class refernce variable 
		
		//down coasting means we are making we are degraiging coasting of car class parent class will be do child class object and then refered by child class reference variable 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
