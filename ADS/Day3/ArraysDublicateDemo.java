class ArraysDublicateDemo{

	public static void main(String arg[]){
		
		int arr[] = new int[] {10,20,40,3,5,2,6,10,3,5};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}