import java.util.*;

class ArraysDublicateDemo1{

	public static void main(String arg[]){
		
		int arr[] = new int[] {10,20,40,3,5,2,6,10,3,5};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1;i++){
			if(arr[i] == arr[i+1])
	      System.out.println(arr[i]);
		}
		
		
	}
}