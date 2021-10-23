package com.athensoft.day06;

public class DemoConstructor {

	
	/**
	 * constructor
	 */
	public DemoConstructor() {
		
	}
	
	public static void main(String[] args) {
//		Duck duck1 = new Duck();
		
//		Duck duck1 = new Duck();
		Duck duck1 = new Duck("Peter");
		System.out.println(duck1);
		System.out.println(duck1.toString());
		
		Duck duck2 = new Duck("Tom","white");
		System.out.println(duck2);
		System.out.println(duck2.toString());
		
		
		//challenge is to make the statement work?
		//What should we do?
		Duck duck3 = new Duck();	//the default constructor does exist!
		
		
		
		
	}

}
