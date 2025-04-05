class Hsort{
	
	
	void hepify(int arr[],int n ,int i){
		int largest = i;
		int l= 2*i+1;
		int r= 2*i+2;
		
		if(l<n && arr[l]>arr[largest])
			largest=l;
		if(r<n && arr[r]>arr[largest])
			largest=r;
		
		if(largest !=i){
			int temp = arr[i];
			 arr[i]= arr[largest];
			arr[largest] =temp;
			hepify(arr,n,largest);
		}
		
	}
	
	void heapSort(int arr[]){
		int n = arr.length;
		for(int i =n/2-1; i>=0;i--){
			hepify(arr,n,i);
		}
		for(int i =n-1;i>0;i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			hepify(arr ,i,0 );
			
		}
	}
	
	
	
	
	
	
	void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String arg[]){
		int arr[] = {43,7,4,2,8,11,5,3,70,50,20};
		int n =arr.length;
		
		Hsort h1 = new Hsort();
		
		System.out.println("before");
		h1.display(arr);
		
		
		h1.heapSort(arr);
		System.out.println("\nafter");
		
		h1.display(arr);
		
	}

}