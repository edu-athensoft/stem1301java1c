package com.athensoft.demo.m5.s62;

public class DefaultField {

	private int age;
	private long id;
	private char type;
	private float score;
	private double average;
	private String name;
	
		@Override
	public String toString() {
		return "DefaultField [age=" + age + ", id=" + id + ", type=" + type + ", score=" + score + ", average="
				+ average + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		DefaultField obj1 = new DefaultField();
		System.out.println(obj1);

	}

}
