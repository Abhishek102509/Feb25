package Day14;

import java.util.Comparator;
import java.util.TreeSet;

 class Employee {
	
	int empId;
	String empName;
	
	Employee(int empId , String empName){
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public String toString() {
		return  empId + "=" + empName;
	}
    
 }
	class EmployeeComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.empId - o2.empId;
		}
		
	}
	
	class EmployeeComparator1 implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o2.empName .compareTo(o1.empName) ;
		}
		
	
	}

public class CollectionDemo3 {

	public static void main(String[] args) {
		
		TreeSet<Employee> a = new TreeSet<Employee>(new EmployeeComparator());
		a.add(new Employee(11, "Ravi"));
		a.add(new Employee(21, "Ravi1"));
		a.add(new Employee(51, "Ravi2"));
		a.add(new Employee(61, "Ravi3"));
		a.add(new Employee(14, "Ravi4"));
		a.add(new Employee(66, "Ravi5"));
		a.add(new Employee(41, "Ravi6"));
		
		System.out.println(a);
	}

}
