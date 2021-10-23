package com.athensoft.demo.m5.s64.demo2;

/**
 * Java file: BicycleStaticApp2.java
 * instances share static fields
 * 
 * @author Athens
 *
 */
public class BicycleStaticApp2 {
	public static void main(String[] args) {
		Bicycle2 bike1 = new Bicycle2(10, 15, 1);
		System.out.println("shared id=" + bike1.getID());

		Bicycle2 bike2 = new Bicycle2(10, 15, 2);
		System.out.println("shared id=" + bike2.getID());

		Bicycle2 bike3 = new Bicycle2(10, 15, 3);
		System.out.println("shared id=" + bike3.getID());

	}
}
