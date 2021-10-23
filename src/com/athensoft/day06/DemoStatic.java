package com.athensoft.day06;

public class DemoStatic {

	public static void main(String[] args) {
		
		// the 1st way to access
		Cat.qty = 1;	//access static attribute without any instance(object)
		System.out.println(Cat.qty);
		
		// the 2nd way to access
		Cat cat1 = new Cat();
		cat1.qty = 2;	//access with an object(instance)
		System.out.println(cat1.qty);
		
		

	}

}

class Cat{
	static int qty = 0;
//	int static count = 1;  //ERROR
}
