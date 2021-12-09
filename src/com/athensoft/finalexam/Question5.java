package com.athensoft.finalexam;

public class Question5 {
	public static void foo(int[] mylist) {
		mylist[0] = 9;
		System.out.println(mylist[0]+","+mylist[1]);
	}

	public static void main(String[] args) {
		int[] mylist = { 1, 2 };
		System.out.println(mylist[0]+","+mylist[1]);
		foo(mylist);
		System.out.println(mylist[0]+","+mylist[1]);
		mylist[0] = 99;
		System.out.println(mylist[0]+","+mylist[1]);
	}
}
