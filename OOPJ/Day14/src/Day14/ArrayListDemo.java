package Day14;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList<>();
		
		a1.add("Abhishek");
		a1.add("Adarsh");
		a1.add("Araya");
		a1.add("Raj");
		
		System.out.println(a1);
		
		System.out.println(a1.get(0));
		
		//Traverse
		for(int i = 0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		//Traverse 2
		
		for(String x : a1 ) {
			System.out.println(x);
		}
		
		
		

	}

}
