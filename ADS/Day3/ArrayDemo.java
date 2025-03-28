class ArrayDemo{
	static int arr[] =new int[15];
	static int n=0;

   static void display(){
	   for(int i =0;i<n;i++){
		   System.out.print(arr[i]+" ");
	   }
   }	
   
   //Insert element in An Arrays
   static void insert(int value){
	   if(n<arr.length){
		   arr[n]=value;
		   n++;
	   }else{
		   System.out.println("Arrays is full");
	   }
	   
   }
   //find Element in An Arrays
   static boolean find(int key){
	   for(int i=0; i<n;i++){
		    if(arr[i]==key){
				return true;
			}
	   }
	   return false;
   }
   
   //Deletion operation:
	static void delete(int key1){
		int i;
		//find element
		for( i=0;i<n;i++){
			if(arr[i] == key1){
				//n--;
				break;//Found: exit the loop
			}
		}
		//If element doesnot exist
		if(i == n){
			System.out.println("Element doesnot exist!");
			return;
		}
		//If exist then shifting the elements
		for(int k=i;k<n;k++){
			arr[k] = arr[k+1];//shifting of all elements
		}
		n--;
	   
   }
   
   
	
	
	public static void main(String arg[]){
		
		insert(10);
		insert(20);
		insert(90);
		insert(50);
		insert(70);
		insert(20);
		System.out.println("===================");
		
		display();
		System.out.println("===================");
		
		int key = 20;
		if(find(key)){
			System.out.println("Element found "+key);
		}
		else{
			System.out.println("Element not found "+key);
		}
		System.out.println("===================");
		int key1=50;
		delete(key1);
		
		System.out.println("===================");
		
		display();
		System.out.println("===================");
		
		
		
		
	}
}