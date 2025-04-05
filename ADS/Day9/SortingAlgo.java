import java.util.*;

class SortingAlgo{
	//Bubble
	void bsort(int arr[]){
		int n = arr.length;
		for(int i =0;i<n-1;i++){
			for(int j =0; j<n-i-1;j++){
				if(arr[j] >arr[j+1])
				{
					int temp =arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
		}
		
		
	}
	
	void ssort(int arr[]){
		int n= arr.length;
		for(int i=0; i<n-1;i++){
			int min =i;
			for(int j = i+1; j<n; j++){
				if(arr[j]<arr[min]);
				min =j;
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]= temp;
			
		}
		
	}
	
	void isort(int arr[]){
		int n = arr.length;
		for(int i=0; i<n; i++ ){
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		
	}
	
	
	
	
	void display(int arr[]){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
		
		}
	}
	
	
	
	
	
	public static void main(String arg[]){
		
		int arr[] = {5,3,7,2,9,4,0,4,7,11};
		SortingAlgo b1 = new SortingAlgo();
		System.out.println("Bubble");
		b1.bsort(arr);
		b1.display(arr);
		System.out.println("\nSelection");
		b1.ssort(arr);
		b1.display(arr);
		
		System.out.println("\nInsertation");
		b1.isort(arr);
		b1.display(arr);
		
		
		
		
		
		
	}
}