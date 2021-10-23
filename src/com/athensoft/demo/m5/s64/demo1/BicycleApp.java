package com.athensoft.demo.m5.s64.demo1;

/**
 * Instance variable or field
 * Instances have their own states
 * @author Athens
 *
 */
public class BicycleApp {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle(8,12,1);
		Bicycle bike2 = new Bicycle(9,13,2);
		Bicycle bike3 = new Bicycle(10,15,3);
		
		System.out.println(bike1);
		System.out.println(bike2);
		System.out.println(bike3);

	}

}
