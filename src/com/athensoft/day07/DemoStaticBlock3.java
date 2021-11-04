package com.athensoft.day07;

/**
 * static block is use for static initialization
 * 
 * the timing
 * the order of executing for static blocks 
 * @author Athens
 *
 */
public class DemoStaticBlock3 {
	
	static {
		System.out.println("static block 1");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
	
	static {
		System.out.println("static block 2");
	}

}
