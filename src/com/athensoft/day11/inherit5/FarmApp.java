package com.athensoft.day11.inherit5;

public class FarmApp {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		dog1.eat();
		dog1.sleep();
		dog1.run();
		dog1.play();
		
//		System.out.println(dog1.name);	// not good
//		System.out.println(dog1.age);	// not good
		
//		System.out.println(dog1.species);  
		
		dog1.setName("Peter");
		dog1.setAge(1);
		
		System.out.println(dog1.getName());
		System.out.println(dog1.getAge());
		
		
		PoliceDog pd1 = new PoliceDog();
		pd1.bark();
		
		pd1.eat();
		pd1.sleep();
		pd1.run();
		pd1.play();
	}

}