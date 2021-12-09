package com.athensoft.demo.m6.s3;

public class Animal {
	protected String name;
	protected int age;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("Animal eats.");
	}
	
	public void sleep() {
		System.out.println("Animal sleeps.");
	}
	
	
}
