package com.athensoft.day03;

public class DemoReturn {

	boolean flag ; //false
	
	
	public static void doTestReturn() {
		System.out.println("askldfjaskldfjkasdfa");
		System.out.println("askldfjaskldfjkasdfa");
		System.out.println("askldfjaskldfjkasdfa");
		System.out.println("askldfjaskldfjkasdfa");
		
		//return
		//make flow control, jump out of the method 
		return ;
		
		//
//		System.out.println("askldfjaskldfjkasdfa");
	}
	
	
	/**
	 * to use return statement to flow control
	 */
	public static void doTestReturn2() {
		System.out.println("askldfjaskldfjkasdfa");
		System.out.println("askldfjaskldfjkasdfa");
		System.out.println("askldfjaskldfjkasdfa");
		System.out.println("askldfjaskldfjkasdfa");
		
//		boolean flag = false;
		boolean flag = true;
//		boolean flag ;
		System.out.println(flag);
		
		if (flag) {
			return;
		}
		
		System.out.println("222222 - askldfjaskldfjkasdfa");
		System.out.println("222222 - askldfjaskldfjkasdfa");
		System.out.println("222222 - askldfjaskldfjkasdfa");
		
	}
	
	
	/**
	 * return with a variable or constant name
	 * @return
	 */
	public static String getName() {
		String myName = "Peter";
		return myName;		
	}
	
	/**
	 * return with a literal
	 * @return
	 */
	public static long getID() {
//		long myID = 1934853234L;
		return 1934853234L;		
	}
	
	public static void main(String[] args) {
		
		doTestReturn2();
	}

}
