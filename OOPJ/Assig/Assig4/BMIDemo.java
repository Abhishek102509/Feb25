import java.util.Scanner;

class BMICalculator{
	private double height;
	private double weight;
	
	BMICalculator(double height,double weight){
		this.height=height;
		this.weight=weight;
	}
	double getHeight(){
		return height;
	}
	void setHeight(double height){
		this.height=height;
	}
	double getWeight(){
		return height;
	}
	void setWeight(double weight){
		this.weight=weight;
	}
	double calculateBMI(){
		return weight/(height*height);
	}
}


class BMIDemo {
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("heightin meters");
		double height = sc.nextDouble();
		System.out.println("weight in meters");
		double weight = sc.nextDouble();
		
		
		
		BMICalculator b1 =new BMICalculator(weight,height);
		//b1.setHeight(height);
		//b1.setWeight(weight);
		double bmi = b1.calculateBMI();
		System.out.println(bmi);
	
	}

}