package Day14;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[]) {
		Map <Integer,String> s1 = new HashMap<>();
		
		s1.put(11, "Abhishek");
		s1.put(12, "Yadav");
		s1.put(13, "Abhi");
		
		System.out.println(s1);
		
		System.out.println(s1.get(11));
	   System.out.println(s1.get("Abhishek"));//null 
	}
}
