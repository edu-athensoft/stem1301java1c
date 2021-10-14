package com.athensoft.day04;

public class DemoVarargs {

	public static void main(String[] args) {
		// pass only one argument
		checkVarargs(1);
		System.out.println("===============");
		
		// pass two args
		checkVarargs(1,2);
		
		
		// pass arbitrary args
		checkVarargs(1,2,3,3,3,4,5,6,7);
		

	}

	/**
	 * to be of the same type 
	 * internally, it is taken as an array
	 * @param numbers
	 */
	public static void checkVarargs(int... numbers) {
		for (int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
}
