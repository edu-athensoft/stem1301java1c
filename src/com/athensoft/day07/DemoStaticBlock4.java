package com.athensoft.day07;

/**
 * static block is use for static initialization
 * 
 * the timing
 * the order of executing for static blocks 
 * @author Athens
 *
 */
public class DemoStaticBlock4 {
	
	public static String name;
	private int age;
	
	static {	
		System.out.println("static block 1");
		int a = 0;	//local variable
		System.out.println(a);
		
//		static int b = 1;
//		static final int b = 1;
		final int b = 1;  // constant
		System.out.println(b);
		
		//can we access the name directly?
		name = "my name";
		nickName = "my nickname";
		
		//accessing instance attribute age
//		age = 0;	//error
		
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	public static String nickName;

}
