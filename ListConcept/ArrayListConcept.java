package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static<E> void main(String[] args) {
		
		//Arraylist is a dynamic array 
		//static array is size is fixed
		//In arraylist their is no problem with the size automatically the moment you add the values automatically size will be increased
		
		int a[] = new int [3];
		
		//dynamic ar = new Arraylist ();
		//can contain duplicate values /elements 
		//maintains insertion order 
		//synchronized 
		//allow you random access to fetch the element because it stores the value on the basis of indexes
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.add(12.33);
		ar.add("test");
		ar.add('a');
		ar.add(true);
		
		
		
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		//to print all the values from arraylist 
		//1.for loop 
		//2.using iterator
		
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
		//non generic vs generic 
		
		ArrayList<Integer>ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("selenium");
		
		ArrayList<String>ar2 = new ArrayList<>();
		ar2.add("test");
		ar2.add("selenium");
		
		ArrayList<E>ar3 = new ArrayList<>();
		
		
		Employee e1 = new Employee("satya" ,27, "QA");
		Employee e2 = new Employee("Nani" ,28,"Dev");
		Employee e3 = new Employee ("narayana" ,29,"Admine");
		
		ArrayList<Employee>ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		
		//iterator to traverse the value 
		
		Iterator<Employee>it = ar4 .iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
			
			
		}
		System.out.println("-------------");
		
		//addAll
		ArrayList<String>ar5 = new ArrayList<>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("qtp");
		
		ArrayList<String>ar6 = new ArrayList<String>();
		
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javascript");
		
		ar5.addAll(ar6);
		
		for(int i =0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("-----------");
		
		//removeall 
		
		
		
		ar5.removeAll(ar6);
		
		for(int i =0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		//retainall 
		ArrayList <String>ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("qtp");
		
		ArrayList<String>ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("java");
		
		ar7.retainAll(ar8);
		
		for(int i =0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
			
		
		

	}

}
