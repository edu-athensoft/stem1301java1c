package com.athensoft.day11.inherit5;

public class Animal {
	
	protected String name;
	protected double age;
	
	private String species;		//private, invisible
	
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
