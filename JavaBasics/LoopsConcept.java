package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
	
		//1.while loop 
		//dis -advantage of while loop : it will generate infinite loop if you don't give incremental/decremental part
		
		int i =1;//initialization 
		while (i <=10) {//conditional 
				System.out.println(i);
				i = i+1;//incremental
				
		}
		System.out.println("--------");
		
		//j ++ means j=j+1
		//for loop
		for (int j =1; j<=10;j++) {
			System.out.println(j);
		}
		//print 10 to 1
		//10 9 8 7 6 5 4 3 2 1
		//k -- means k = k-1
		for (int k =10;k>=1;k--) {
			System.out.println(k);
		}
		
		//-1>-10 true 
		//1>10 false 
			

	}

}
