package com.athensoft.day04;

public class DemoMethodParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 10;
		System.out.println("before passing, b ="+b);
		setProperties(b);
		System.out.println("after passing, b ="+b);
		
		
		// Pass by value
		int[] numbers = {1,2,3,4,5};
		setProperties(numbers);
		
		numbers[1] = 22;
		setProperties(numbers);
		

	}
	
	static void setProperties() {
		
	}
	
	/**
	 * a is a local variable
	 * @param a
	 */
	static void setProperties(int a) {
		System.out.println("before change, a ="+a);
		a = a - 1;
		System.out.println("after change, a="+a);
	}
	
	static void setProperties(String a) {
		System.out.println("before change, a ="+a);
//		a = a - 1;
//		System.out.println("after change, a="+a);
	}
	
	static void setProperties(int a, int b) {
		
	}
	
	static void setProperties(int a, int b, String c) {
		
	}
	
	/**
	 * the local scope of numbers and passing by value
	 * @param numbers
	 */
	static void setProperties(int[] numbers) {
		for (int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// change item of numbers here
		// would it be also change in the main method
	}


}
