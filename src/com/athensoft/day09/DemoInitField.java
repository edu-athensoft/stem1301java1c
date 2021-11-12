package com.athensoft.day09;

public class DemoInitField {
	
	private String name ;  //empty string or null?
	private boolean flag = true ;  // 2nd. way
	private int age;
	private double weight;
	
	{
		System.out.println("init block.");
		//write your code only for initialization
		age = 20;		//3rd. way
	}
	
	public DemoInitField() {
		this.name = "Athensoft";		// 1st. way
		System.out.println("constructor.");
	}

	
	
	public static void main(String[] args) {
		
		DemoInitField dc = new DemoInitField();
		System.out.println(dc);
		
	}

	@Override
	public String toString() {
		return "DemoConstructor [name=" + name + ", flag=" + flag + ", age=" + age + ", weight=" + weight + "]";
	}

}
