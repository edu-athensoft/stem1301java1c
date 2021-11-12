package com.athensoft.day09;

public class DemoConstructor {
	
//	private String name = "Athensoft";
	private String name ;  //empty string or null?
	private boolean flag ;  // false
	private int age;
	private double weight;
	
	{
		//write your code only for initialization
	}
	
	public DemoConstructor() {
		this("Athensoft");
	}
	
	public DemoConstructor(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		// there is no default value for local variable
		
//		int a;
//		System.out.println(a);
		
		DemoConstructor dc = new DemoConstructor();
		System.out.println(dc);
		
		DemoConstructor dc2 = new DemoConstructor();
		System.out.println(dc2);
		
		DemoConstructor dc3 = new DemoConstructor("Dell");
		System.out.println(dc3);
		
	
	}

	@Override
	public String toString() {
		return "DemoConstructor [name=" + name + ", flag=" + flag + ", age=" + age + ", weight=" + weight + "]";
	}

}
