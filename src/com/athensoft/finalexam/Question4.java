package com.athensoft.finalexam;

public class Question4 {
	public static void foo(int num){
	      num = num + 1;
	      System.out.println(num);
	    }
	public static void main(String[] args) {
		int num = 9;
		System.out.println(num);
		foo(num);
		System.out.println(num);
		num = 10;
		foo(num);
		System.out.println(num);
	}
}
