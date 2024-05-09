package com.calculator.in;



public class Triangle {

double side1,side2,side3;
	
	
	
	public Triangle(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public Triangle() {
		this.side1=0;
		this.side2=0;
		this.side3=0;
	}
	
	private double getArea() {
		double s =(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

	}
	
	private double getPerimeter() {
		return side1+side2+side3;

	}
	private void setSide(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;

	}
	
	public static void main(String[] args) {
		
		Triangle triangle1=new Triangle();
		triangle1.setSide(2, 6, 7);
		System.out.println("Area: "+ triangle1.getArea());
		System.out.println("Primeter: "+ triangle1.getPerimeter());
		
		Triangle triangle2 = new Triangle(2, 6, 7);
		System.out.println("Area: "+ triangle2.getArea());
		System.out.println("Primeter: "+ triangle2.getPerimeter());
		
	}
}
