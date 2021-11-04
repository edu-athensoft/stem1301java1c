package com.athensoft.day07;

/**
 * static block is use for static initialization
 * 
 * the timing
 * the order of executing for static blocks 
 * @author Athens
 *
 */
public class DemoStaticBlock2 {
	
	static {
		System.out.println("static block 1");
	}

	public static void main(String[] args) {
		DemoStaticBlock2 dsb1 = new DemoStaticBlock2();
		DemoStaticBlock2 dsb2 = new DemoStaticBlock2();
		DemoStaticBlock2 dsb3 = new DemoStaticBlock2();
	}
	
	static {
		System.out.println("static block 2");
	}

}
