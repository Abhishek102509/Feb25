package Day14;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String arg[]) {
		
		List<Integer> l1 = new LinkedList<>();
		 
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
		
		l1.addFirst(80);
		l1.addLast(78);
		
		System.out.println(l1);
	}
	
}
