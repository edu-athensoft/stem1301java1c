package com.athensoft.day03;

public class DemoParam {

	public static void doTestParam1(int age, String name) {
		System.out.println("age ="+age);
		System.out.println("name ="+name);
	}
	
	
	public void doTestParam2(String name, int age) {
		
	}
	
	public static void main(String[] args) {
		// method
		
//		doTestParam1();  //it is not the same method as doTestParam1(int age, String name) 
		
		doTestParam1(20, "Peter");
		
//		System.out.println(age);

	}

}
