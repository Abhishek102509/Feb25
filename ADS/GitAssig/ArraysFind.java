class ArraysFind{
	
	static int find(int arr[],int key){
		int n =arr.length;
		for(int i=0; i<n; i++ ){
			if(arr[i]==key){
				return i;
			}
			
		}
		return -1;
		
	}
	
	
	public static void main(String arg[]){
		
	  int arr[] ={10,20,80,30,60,50,110,100,130,170};
	int x =180;
	
	int r =find(arr,x);
	if(r==-1){
		System.out.println(r);
		System.out.println("Element x is not present");
	}else{
		System.out.println(r+1);
		System.out.println("Element x is  present at index ");
		
	}
	
	}
}