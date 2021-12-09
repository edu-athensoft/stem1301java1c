package com.athensoft.day13;

public class Person {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name, final String TITLE_NAME) {
		this.name = name;
		addTitle(TITLE_NAME);
	}
	
	
	private void addTitle(final String TITLE_NAME) {
		this.name = TITLE_NAME + this.name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person p1  = new Person();
		System.out.println(p1.getName());
		
		p1.setName("White", PersonTitle.SIR_TITLE);
//		PersonTitle.SIR_TITLE = "SIR  ";
		System.out.println(p1.getName());
		
		final String title = "Mrs. ";
		p1.setName("White", title);
		System.out.println(p1.getName());
	}
	
	
}
