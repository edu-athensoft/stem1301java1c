package com.athensoft.day02;

public class DemoField3 {

	private int age;
	public String name;
	private String name2;

	public static void main(String[] args) {
		DemoField3 df3 = new DemoField3();

		System.out.println(df3.getName());
		System.out.println(df3.getName2());

		System.out.println(df3.getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
