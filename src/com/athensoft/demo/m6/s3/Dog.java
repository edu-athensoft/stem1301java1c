package com.athensoft.demo.m6.s3;

public class Dog extends Animal{
	
	private String breed;
	
	/*
	 * here Dog() will implicitly call super class constructor
	 * Animal(), and super() would be the first statement to call
	 * at background.
	 * 
	 */
	public Dog(String name, int age) {
		/*this super() requires the constructor Animal() 
		defined in the superclass */
//		super();	
			
		/* this super(name, age) requires the constructor 
		 * Animal(String name, String age) defined in Animal */
//		super(name, age);
		this.name = name;
		this.age = age;
		this.breed = "unknown";
	}
	
	public void bark() {
		System.out.println("Dog barks.");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", name=" + name + ", age=" + age + "]";
	}


	
}
