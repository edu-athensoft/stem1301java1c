package com.athensoft.day07;

public class DemoInstanceMember {

	public static void main(String[] args) {
//		Dog dog1 = new Dog();
//		dog1.eat();
		
		Dog.sleep();
		
		

	}

}

class Dog{
	
	private String name;
	private static int iq = 100; 
	
	public static void walk() {
		System.out.println("static walk() is called.");
	}
	
	public static void sleep() {
		System.out.println("static sleep() is called.");
		walk();
		System.out.println(iq);
	}
		
	public void eat() {
		System.out.println("dog eat() is called.");
//		bark();
		this.bark();
		
//		Dog.sleep();
		sleep();
		
		System.out.println(iq);
	}
	
	public void bark() {
		System.out.println("dog bark() is called.");
		name = "Peter";		//directly
	}
}
