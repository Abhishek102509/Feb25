import java.util.*;

class Student1{
	private String name;
    private int rollNo;
    private double[] marks = new double[5];
    private double average;
    private char grade;
	
	Student1(String name,int rollNo,double[] marks){
		
		
		this.name=name;
		this.rollNo=rollNo;
		for(double m : marks){
			if(m<0 || m>100){
				throw new IllegalArgumentException("Marks should be between 0 and 100.");
			}
		}
		this.marks=marks;
	}
	void calculateAverage(){
		double total =0.0;
		for(double m : marks){
			total+=m;
		}
		average=total/marks.length;
	}
	
	void calculateGrade(){
		if(average>=90){
			grade = 'A';
		}else if(average<=80 && average<90){
			grade = 'B';
		}else if(average<=70 && average<80){
			grade = 'C';
		}else if(average<=60 && average<70){
			grade = 'D';
		}else{
			 grade = 'F';
		}
	}
	 public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.print("Marks: ");
        for (double m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\nAverage: " + average);
        System.out.println("Grade: " +grade);
    }
}



class Student{
	public static void main(String arg[]){
	Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();

            System.out.println("Enter marks for 5 subjects:");
            double[] marks = new double[5];
            for (int i = 0; i < 5; i++) {
                marks[i] = scanner.nextDouble();
            }
            Student1 student = new Student1(name, rollNo, marks);
			
            student.calculateAverage();
            student.calculateGrade();
            student.displayStudentInfo();

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values for marks.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}