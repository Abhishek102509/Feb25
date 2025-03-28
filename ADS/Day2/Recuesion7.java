import java.util.*;

class Recuesion7{
	 static double div(double n){
		
		if(n==1){
			return 1;
		}
		if(n%2==0){
			return div(n-1)-(1/n);
		}else{
			return div(n-1)+(1/n);
		}
	}
	public static void main(String arg[]){
		
		
		System.out.println(div(3));
	}
}