package com.athensoft.demo.m6.s143;

public class Manager extends Employee{
	public void printName() {
		System.out.println(this.name);		//visible
	}
	
	public void printSalary() {
		System.out.println(this.salary);	//visible
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", salary=" + salary + "]";
	}	
}
