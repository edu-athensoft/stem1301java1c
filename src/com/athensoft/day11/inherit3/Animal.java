package com.athensoft.day11.inherit3;

public class Animal {
	
	public String name;
	public double age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void run() {
		System.out.println("runs");
	}
	
	public void eat() {
		System.out.println("eats");
	}
	
	public void sleep() {
		System.out.println("sleeps");
	}
	
	public void play() {
		System.out.println("plays");
	}
	
	
}
