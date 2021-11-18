package com.athensoft.demo.m6.s144;

public class Employee {
	protected String name;
	protected double salary;
	
	private void changeName(String newName) {
		this.name = newName;
	}
	
	protected void raiseSalary(double amount) {
		this.salary += amount;
	}
	
	public void checkName() {
		System.out.println(this.name);
	}

}
