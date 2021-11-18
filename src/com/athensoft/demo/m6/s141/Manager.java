package com.athensoft.demo.m6.s141;

public class Manager extends Employee{
	public void printName() {	
//		System.out.println(this.name);	//invisible
		
	}
	
	public void printSalary() {
//		System.out.println(this.salary); //visible
	}

	@Override
	public String toString() {
		return "Manager []";
	}
}
