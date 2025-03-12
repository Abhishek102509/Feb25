class Car1{
   double gas = 0 ;
   double km = 0;
   double efficency =0;
   
   void drive()
   {
	   System.out.println("Is driving");
   }
   
   
   void loadgas(double gas)
   {
	   this.gas =gas;
	   System.out.println("Gas loaded");
	  
   }
   void changEfficiency(double eff)
   {
	   efficency =eff;
   }
   void checkGass()
   {
	   System.out.println("Gas left : "+ gas);
   }
   void odomeleRead()
   {
	   System.out.println("Is driving" + (efficency/gas));
   }
}

class Car{
	public static void main(String args[]){
		Car1 cr = new Car1();
		cr.drive();
		cr.loadgas(545);
		cr.changEfficiency(45);
		cr.checkGass();
		cr.odomeleRead();
	}
	
}