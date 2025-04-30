// import java.util.*;

//Method 1
/*
class Largest{
    public static void main(String[] args) {
        int arr[] ={12, 13, 1, 10, 34, 10};
        int max =arr[0];
        int n = arr.length;

        for(int i =0; i<n; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
    */


//Method 2 recursion

/* 

class Largest{
    static int max(int arr[],int n){

        if(n==1)
        return arr[0];

        return Math.max(arr[n-1], max(arr,n-1));

    }

    public static void main(String[] args) {

        int arr[] ={12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.println(max(arr,n));
       
    }
}
 
*/



//Method 3