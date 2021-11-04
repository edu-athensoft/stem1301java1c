package com.athensoft.day07;

public class DemoStaticMethod {

	public static void main(String[] args) {
		// case 1. to call a static method without creating any objects
		Cat.sleep();
		
		// case 2. to call it with an instance
		Cat cat1 = new Cat();
		cat1.sleep(); 
		

	}

}


class Cat{
	public static void sleep() {
		System.out.println("static sleep() is called.");
	}
}
