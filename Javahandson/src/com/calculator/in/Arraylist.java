package com.calculator.in;

public class Arraylist {
	
	public static void main(String[] args) {
		String[] name = {"ABC","DBC","ADC"};
		
		for (String s : name) {
			if (s=="DBC") {
				System.out.println(s);
				break;
			}
			System.out.println(s);			
		}
	}
	
}	
	


