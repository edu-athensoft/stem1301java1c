package com.athensoft.day10;

/**
 * Performance
 * 
 * in time and space
 * @author Athens
 *
 */
public class DemoArt {


	public static void main(String[] args) {
		int[] numbers = {2,5,7,6,4,19,8,3,4,1};
		
//		System.out.println(numbers);
		
//		for(int i:numbers) {
//			System.out.println(i);
//		}
		
		//max number in the list
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i: numbers) {
			if( i > max) {
				max = i;
			}
			if( i < min) {
				min = i;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		

	}

}
