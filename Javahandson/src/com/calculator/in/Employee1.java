package com.calculator.in;



public class Employee1 {
	
	double salary;
	double worksPerHour;
	
	public Employee1(double salary,double worksPerHour) {
		this.salary=salary;
		this.worksPerHour=worksPerHour;
	}
	
	private void addSal() {
		if(salary<=1500);
		salary+=1000;
	}
	
	private void AddWork() {
		if(worksPerHour>6);
		salary+=500;

	}
	
	private double getFinalSalary() {
		
		return salary;

	}
	
	public void GetInfo(double salary,double worksPerHour) {
		System.out.println("Salary" + salary);
		System.out.println("worksperHour" + worksPerHour);
	} 
	
	public static void main(String[] args) {
		
		Employee1 employee = new Employee1(1000, 8);
		employee.addSal();
		employee.AddWork();
	Double Finalsalry=	employee.getFinalSalary();
	System.out.println(Finalsalry);
		
	}

}
