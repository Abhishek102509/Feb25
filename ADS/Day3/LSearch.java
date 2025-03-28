
class LSearch {
	 
		static int Search (int arr[],int x){
			int n = arr.length;
			for(int i=0;i<n;i++){
				if(arr[i]==x){
					return i;
				}
			}
			return -1;
			
		}
	
    public static void main(String[] args) {
		int arr[] = {10,30,40,56,10,46};
		int key = 30;
		int r = Search(arr,key);
		     if(r==-1)
				 System.out.println("Element Not Found");
			 else
				System.out.println("Element Found");
		
		
	}
}