package com.athensoft.demo.m5.s63;

/**
 * Varargs / Variable-length arguments
 * @author Athens
 * 
 * @since 1.5
 *
 */
public class DemoMethodParamVarargs {

	
	public static void showNumbers(int... nums) {
		for(int n : nums) {
			System.out.println(n);
		}
		
//		System.out.println(nums.getClass().getName());

	}
	
	public static void main(String[] args) {
		showNumbers(1,2,3);
		
		System.out.println("=========");
		
		showNumbers(4,5,6,7,8);
		
		
	}

}
