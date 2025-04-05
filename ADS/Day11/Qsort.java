class Qsort{
	
	static void quickSort(int arr[], int l ,int h)
	{
		if(l<h)
		{
			int pi = partation(arr,l,h);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,h);	
		}
	}
	
	static int partation(int arr[],int l ,int h)
	{
		int pivot = arr[h];
		int i = l-1;
		
		for(int j=l;j<h;j++)
			if(arr[j]<pivot)
		{
			i++;
			swap(arr,i,j);
		}
		swap(arr,i+1,h);
		return i+1;
	}
	
	static void swap(int arr[],int i,int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
		
	}
	
	
	
	void display(int arr[]){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String arg[]){
		
		int arr[] = {43,7,4,2,2,8,11,5,3,70,50,20};
		int n = arr.length;
		Qsort q1 = new Qsort();
		
		System.out.println("\n");
		q1.display(arr);
		quickSort(arr,0,n-1);
		System.out.println("\n");
	    q1.display(arr);
		
		
		
	}
	
}