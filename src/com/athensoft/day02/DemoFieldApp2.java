package com.athensoft.day02;

/**
 * The public fields can be accessed directly.
 * 
 * access = read/write
 * 
 * @author Athens
 *
 */
public class DemoFieldApp2 {

	public static void main(String[] args) {
		DemoField4 df4b = new DemoField4();
		
		// This broke the rule of information hiding.
		// This is not recommended.
		df4b.name = "New name";
		
		

	}

}
