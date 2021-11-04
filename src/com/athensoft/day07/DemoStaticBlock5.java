package com.athensoft.day07;

/**
 * static block is use for static initialization
 * 
 * the timing
 * the order of executing for static blocks 
 * @author Athens
 *
 */
public class DemoStaticBlock5 {
	
	public static String nickName;
	
	static {	
		System.out.println("static block 1");
	
	}

	public DemoStaticBlock5() {
		System.out.println("constructor");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main");
		DemoStaticBlock5 d1 = new DemoStaticBlock5();
	}
	
	static {
		System.out.println("static block 2");
	}


}
