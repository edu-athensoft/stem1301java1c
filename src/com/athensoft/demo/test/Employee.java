package com.athensoft.demo.test;

import java.util.Date;

public class Employee {
	private String name;
	private double salary;
	private Date hireDay;

	public Employee(){}
	public Employee(String n, double s, int year, int month, int day){}

	public String getName(){
		return this.name;
	}
	public double getSalary(){
		return this.salary;
	}
	public Date getHireDay(){
		return this.hireDay;
	}
	public void raiseSalary(double byPercent){}

}
