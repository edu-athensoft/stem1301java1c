package com.athensoft.day02;

import java.util.Objects;

/**
 * collision
 * @author Athens
 *
 */
public class DemoIdentity {

	public static void main(String[] args) {
		String a1 = "1";
        String b1 = "1";
        
        //If it is called on two equal objects, it returns the same hash code value. 
        System.out.println("2.1-Hash code(a1):\n"+a1.hashCode());
        System.out.println("2.1-Hash code(b1):\n"+b1.hashCode());

        CoffeeMachine cm1 = new CoffeeMachine();
		CoffeeMachine cm2 = new CoffeeMachine();
		
		//They have different identities
		System.out.println("1-Hash code(cm1):\n"+Objects.hash(cm1));
		System.out.println("1-Hash code(cm2):\n"+Objects.hash(cm2));
        
		
		//Objects v.s Object
		
		//Arrays v.s. Array
		
		//Collections v.s. Collection 
	}

}

class CoffeeMachine{
	private String colors;
}
