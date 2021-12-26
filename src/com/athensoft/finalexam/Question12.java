package com.athensoft.finalexam;

public class Question12 {

	public static void main(String[] args) {
		
//		Duck duck1 = new Duck("duck1");
//		Duck duck2 = new Duck("duck1");
//		System.out.println(duck1);
//		System.out.println(duck2);
		
		Duck duck1 = new Duck("duck1");
		Duck duck2 = duck1;
		
		System.out.println(duck1 ==  duck2);
		

	}

}

class Duck {
	private String name;

	public Duck(String name) {
		this.name = name;
	}

//	public static void main(String[] args) {
//		Duck duck1 = new Duck("duck1");
//		Duck duck2 = new Duck("duck1");
//	}
}