package com.athensoft.day02;

/**
 * The public fields can be accessed directly.
 * The private fields should be accessed by means of methods.
 * access = read/write
 * 
 * @author Athens
 *
 */
public class DemoFieldApp {

	public static void main(String[] args) {
		DemoField4 df4 = new DemoField4();
		
		// This broke the rule of information hiding.
		// This is not recommended.
		df4.name = "New name";
		
		// age and name2 are private and hidden.
//		df4.age;
//		df4.name2;
		
		int myAge = df4.getAge();
		String myName2 = df4.getName2();
		
		System.out.println("myAge ="+ myAge);
		System.out.println("myName2 ="+ myName2);
		
		//modify the state or value of member fields
		df4.setAge(20);
		myAge = df4.getAge();
		System.out.println("myAge ="+ myAge);
		
	}

}
