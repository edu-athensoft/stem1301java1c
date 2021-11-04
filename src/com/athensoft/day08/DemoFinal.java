package com.athensoft.day08;

public class DemoFinal {
	public static void main(String[] args) {
		
		final int a;		//declare
		a = 10;
		
		final int b = 10;	//recommended
		
//		b = 10;
		System.out.println(b);
		
		
		
		//
		int c = 123;
//		c ="12abc";
		c = Integer.parseInt("123");
		
		
		
	}
}


class Cat {
//	final private String name;					//ERROR
	final private String name = "Tom";			//OK
	private int age;
}