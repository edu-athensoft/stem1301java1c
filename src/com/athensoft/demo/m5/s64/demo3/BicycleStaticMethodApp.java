package com.athensoft.demo.m5.s64.demo3;


public class BicycleStaticMethodApp {

	public static void main(String[] args) {
		
		//without any instances
		System.out.println(Bicycle.getNumberOfBicycles());
		
		System.out.println(Bicycle.getNumberOfBicycles());
		
		System.out.println(Bicycle.getNumberOfBicycles());
		
		System.out.println("====");
		
		//with an instance, however it is not recommended
		Bicycle b1 = new Bicycle();
		System.out.println(b1.getNumberOfBicycles());
		
		Bicycle b2 = new Bicycle();
		System.out.println(b2.getNumberOfBicycles());
	}

}
