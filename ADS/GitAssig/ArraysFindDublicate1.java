import java.util.*;

class ArraysFindDublicate1{
	

	public static void main(String arg[]){
		
		
		
		// Brout force
		/*int arr[]= {0,3,1,2};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;i<arr.length-1;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
				
			}
			
		}*/
		// ToString And Soring Method
		/*
	  int arr[]= {2,3,1,2,3};
        System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				System.out.print(arr[i]+" ");
			}
		}
		
		*/
		//Using HasSet
		int arr[]= {2,3,1,2,3};
		System.out.println(Arrays.toString(arr));
		Set<Integer> a1=new HashSet<>();
		for(int x :arr ){
			if(!a1.add(x)){
	      System.out.println(x);
			}
		}
		
		
	
	}
}