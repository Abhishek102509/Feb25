import java.util.Scanner;

class ElectricityBill{
	String customerName;
	double unitsConsumed;
	double billAmount;
	
	ElectricityBill(String customerName,double unitsConsumed){
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


class ElectricityBillCal{
	public static void main(String arg[]){
	     Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Enter name");
		 String customerName = "Abhishe";
	     double unitsConsumed =350;
		 
		 
		 ElectricityBill b1 = new ElectricityBill(customerName,unitsConsumed);
	     b1.calculateBillAmount();
	     b1.dispaly(); 
		 
	}
}