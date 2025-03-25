import java.util.Scanner;
import java.util.*;


class ElectricityBill{
	String customerName;
	double unitsConsumed;
	double billAmount;
	
	ElectricityBill(String customerName,double unitsConsumed){
		if(unitsConsumed<0){
			throw new IllegalArgumentException("unitsConsumed can't negativ");
		}
		
		this.customerName =customerName;
	    this.unitsConsumed=unitsConsumed;
		this.billAmount = 0.0;
	}
	
	
	void calculateBillAmount(){
		if(unitsConsumed<=100){
			billAmount = unitsConsumed*5;
		}else if(unitsConsumed<=300){
			billAmount = (100*5)+((unitsConsumed-100)*7);	
		}else{
			billAmount = (100*5)+(200*7)+((unitsConsumed-300)*10);
			
		}
	}
		public void dispaly(){
			System.out.println(customerName);
			System.out.println(unitsConsumed);
			System.out.println(billAmount);
			
		}
	}


class ElectricityBillCal1{
	public static void main(String arg[]){
	     Scanner sc = new Scanner(System.in);
		 try{
			 System.out.println("Enter Customer Name");
			 String name =sc.nextLine();
			 
			 
			 System.out.println("unit Consumed");
			 double unit =sc.nextDouble();
			 
			 ElectricityBill b1 = new ElectricityBill(name,unit);
	         b1.calculateBillAmount();
	         b1.dispaly(); 
			 
		 }catch(InputMismatchException e){
			 System.out.println("user enters non-numeric data for units.");
			 
		 }catch( IllegalArgumentException e){
			 System.out.println(e.getMessage());
		 }
		 
		 
	}
}