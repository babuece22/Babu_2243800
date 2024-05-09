package com.calculator.in;

public class Employee {
	
	public double salary;
	public String employeeName;
	
	
	public Employee(double salary, String employeeName) {
		
		this.salary=salary;
		this.employeeName=employeeName;
	}
	
	private void dispalySalary() {
		
 System.out.println("Salary: "+ salary);
  
	}
	
	 
	private double dispalySalry(double salary) {
		return salary;

	}
	public static void main(String[] args) {
		
		Employee employee = new Employee(1500, "Babu");
		
		employee.dispalySalary();
		
		double finalsalry = employee.dispalySalry(2000);
		System.out.println("Final salary: " + finalsalry);
			
		
	}

}
