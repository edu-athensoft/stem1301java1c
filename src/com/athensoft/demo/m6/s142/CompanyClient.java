package com.athensoft.demo.m6.s142;

public class CompanyClient {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		System.out.println("Attributes of superclass derived.");
		System.out.println(m1);
		
		//public attributes, not safe
		System.out.println(m1.name);
		System.out.println(m1.salary);
		
		m1.name = "Peter";
		System.out.println(m1);
		
		m1.salary = 5000;
		System.out.println(m1);
		
	}
}
