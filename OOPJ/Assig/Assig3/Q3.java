// 2. Reverse an Array
// Reverse the given array in place.


class Q3{
	
	public static void main(String arg[]){
		int arr[] = {1,2,3,4,5,45,56,78,30};
		int low = 0,high =arr.length-1;
		
		System.out.print("Before : ");
		for(int n: arr){
			System.out.print(n +" ");
		}
		
		while(low<high){
			arr[high] = arr[high] + arr[low];
			arr[low] = arr[high] - arr[low];
			arr[high] = arr[high] - arr[low];
			low++;
			high--;
		}
		System.out.print("\nAfter : ");
		for(int n : arr){
			System.out.print(n +" ");
		}
	}
	
}