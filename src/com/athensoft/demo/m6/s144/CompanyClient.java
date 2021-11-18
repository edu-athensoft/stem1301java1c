package com.athensoft.demo.m6.s144;

public class CompanyClient {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		System.out.println("methods of superclass derived.");
		System.out.println(m1);
		
		//protected method, visible
		m1.raiseSalary(200);
		
		//private method, invisible
		//m1.changeName();
		
		//public method, visible
		m1.checkName();
		
		//methods of subclass own
		m1.printName();
		m1.printSalary();
	}
}
