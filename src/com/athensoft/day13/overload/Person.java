package com.athensoft.day13.overload;

public class Person {
	private String name;
	
		
	public String getName() {
		return name;
	}

	
	public void setName() {
		this.name = "Peter";
	}
	
	public void setName(String name) {
		//		this.name = name;
	}
	
	public void setName(String name, String title) {
		//
	}
	
//	public void setName(String name, String title) {
//		//
//	}
	
	

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getName());
		
		p1.setName();	
		System.out.println(p1.getName());	

	}

}
