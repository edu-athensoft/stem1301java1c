package com.athensoft.demo.m6.s143b.p1;

import com.athensoft.demo.m6.s143b.c1.Manager;

public class CompanyClient {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		System.out.println("Attributes of superclass derived.");
		System.out.println(m1);
		
		//not safe but visible
		System.out.println(m1.name);
		System.out.println(m1.salary);
	}
}
