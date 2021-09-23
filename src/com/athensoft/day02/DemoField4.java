package com.athensoft.day02;

/**
 * public fields and private fields
 * @author Athens
 *
 */
public class DemoField4 {
	public String name;
	
	private int age;	
	private String name2;

	public static void main(String[] args) {
		DemoField4 df3 = new DemoField4();

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
