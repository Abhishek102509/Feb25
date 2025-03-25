package Day14;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[]) {
		
		Stack <Integer> s1 = new Stack<>();
		
		s1.push(45);
		s1.push(4);
		s1.push(55);
		s1.push(455);
		
		
		System.out.println(s1);
		System.out.println(s1.peek());
	}
	

}
