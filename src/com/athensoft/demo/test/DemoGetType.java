package com.athensoft.demo.test;

public class DemoGetType {

	public static String getType(Object obj) {
		return obj.getClass().getName();
	}
	
	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(getType(a));

	}

}
