public class Main
{
	public static void main(String[] args) {
	    int n=4;
	    int n2=6;
		for(int i =1;i<=n;i++){
		    for(int j=1;j<=n2;j++){
		        if((i==1 || i==n)||(j==1||j==n2)){
		            System.out.print("*");
		        }else
		        System.out.print(" ");
		    }
		    System.out.println(" ");
		    
		}
	}
}



(*         ******
           *    *
           *    *
           ******        *)
