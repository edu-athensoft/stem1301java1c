package com.athensoft.day09;

public class DemoStaticBlock {
	static int a = 1;
	
	static {
		int b = 2;
		System.out.println(b);
	}
	
	static {
		int c = 3;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		System.out.println(DemoStaticBlock.a);
		
		
		// why does it not work?
//		System.out.println(DemoStaticBlock.b);
	}
}
