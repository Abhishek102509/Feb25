import java.util.*;

class MatrixAdd{
	
	public static void main (String args[]){
	int arr1[][] = new int[3][3];
	int arr2[][] = new int[3][3];
	int result[][] = new int[3][3];
	
	Scanner sc = new Scanner(System.in);
	
	//System.out.println("Enter a number1");
	for(int i=0; i<arr1.length;i++){
		
			for(int j=0; j<arr1[i].length; j++){
				System.out.println("Enter a number " + i + " " +j);
				arr1[i][j] = sc.nextInt();
			}
			
	}
	//System.out.println("Enter a number2");
	for(int i=0; i<arr1.length;i++){
		
			for(int j=0; j<arr1[i].length; j++){
				System.out.println("Enter a number " +i+ " " +j);
				arr2[i][j] = sc.nextInt();
			}
			
	}
	//add
	//System.out.println("Enter a number1");
	for(int i=0; i<arr1.length;i++){
		
			for(int j=0; j<arr1[i].length; j++){
				result[i][j] = arr1[i][j]+arr2[i][j];
				System.out.print(result[i][j]+" ");
				
			}
			System.out.println();
	}
	
}


}