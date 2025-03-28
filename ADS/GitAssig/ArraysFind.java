class ArraysFind{
	static int a1[] ={0,3,1,2};
	static int n =0;
	
	static void display(){
		for(int i=0;i<n; i++){
			System.out.println(a1[n]);

		}
	}
	
	static int find(int key){
		for(int i=0; i<n; i++ ){
			if(a1[i]==key){
				return i;
			}
			
		}
		return -1;
		
	}
	
	
	public static void main(String arg[]){
	
	display();
	int n =3;
	
	System.out.println((find(n)== -1)?"number not found":("number is at position "+(find(n)+1)));
	
	/*if(find(key)){
		System.out.println(" "+key);
	}else
	{
		System.out.println(" "+key);
	}*/
	
	
	
	}
}