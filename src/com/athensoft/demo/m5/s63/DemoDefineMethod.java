package com.athensoft.demo.m5.s63;

public class DemoDefineMethod {

	private void testMethod() {
		System.out.println("testMethod() is called.");
	}
	
	public static void main(String[] args) {
		DemoDefineMethod ddf = new DemoDefineMethod();
		
		//call once
		ddf.testMethod();
		
		//call multiple times
		ddf.testMethod();
		ddf.testMethod();
		
		for (int i=0; i<3; i++) {
			ddf.testMethod();
		}

	}

}
