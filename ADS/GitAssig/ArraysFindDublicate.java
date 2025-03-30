import java.util.*;

class ArraysFindDublicate{
	

	public static void main(String arg[]){
		
		//int arr[]= {0,3,1,2};
		
		/*for(int i=0;i<arr.length;i++){
			for(int j=0;i<arr.length-1;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
			}
			
		}*/
		
		
	  int arr[]= {2,3,1,2,3};
        System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				System.out.println(arr[i]);
			}
		}
		
		
		
	
	}
}