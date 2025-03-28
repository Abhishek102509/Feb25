import java.util.*;

class ArraysDublicateDemo2{

	public static void main(String arg[]){
		
		int arr[] = new int[] {0,3,1,2};
		System.out.println(Arrays.toString(arr));
		Set<Integer> s1 =new HashSet<>();
		
		for(int x: arr ){
			if(!s1.add(x))
	      System.out.println(x);
		}
		
		
	}
}