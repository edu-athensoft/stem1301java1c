package com.athensoft.demo.m6.s143;

public class CompanyClient {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		System.out.println("Attributes of superclass derived.");
		System.out.println(m1);
		
		//protected attribute, not safe but visible
		System.out.println(m1.name);
		System.out.println(m1.salary);
	}
}
