// 1. Find the Largest and Smallest Element
// Given an array, find the smallest and largest elements in it


class Q1{
	
	public static void main(String arg[]){
		int arr[] = {1,2,3,4,5,45,56,78,30};
		int largest = arr[0];
		int smallest = arr[0];
	
		for(int i= 0; i<arr.length;i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
			if(arr[i]<smallest){
				smallest = arr[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
		
		
	}
	
}