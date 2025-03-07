// Matrix Addition 

import java.util.* ;
import java.lang.*;


class Main{
 
	public static void main(String Args[])
	{
   
   int arr1[][] = new int[3][3] ;
   int arr2[][] = new int[3][3] ;
   
   
   Scanner sc = new Scanner(System.in) ;
   
   
   
      // input arr1
     for(int i = 0 ; i < arr1.length ; i++)
	 {
		 for(int j = 0 ; j < arr1[i].length ; j++)
		 {
			 
			System.out.println("Enter the value: " +i+ " " +j+ );
			arr1[i][j] = sc.nextInt() ;
		 }
	 }
	 
	 // input arr2
	 for(int i = 0 ; i < arr2.length ; i++)
	 {
		 for(int j = 0 ; j < arr2[i].length ; j++)
		 {
			 
			System.out.println("Enter the value: ");
			arr2[i][j] = sc.nextInt() ;
		 }
	 }
  
     // matrix addition 
	  
	  int[][] res =  new int[3][3] ; 
	  // addition of 2 matrix 
	   for(int i = 0 ; i < res.length ; i++)
	 {
		 for(int j = 0 ; j < res[i].length ; j++)
		 {
			 res[i][j] = arr1[i][j] + arr2[i][j] ;
			
		 }
	 }
	  // matrix addition print 
	    System.out.println("Addition of two sMatrix  ");
	  
        for(int i = 0 ; i < res.length ; i++)
	 {
		 for(int j = 0 ; j < res[i].length ; j++)
		 {
			System.out.print( res[i][j]+" ");
		 }
			System.out.println();

	 }	 
}	 

}