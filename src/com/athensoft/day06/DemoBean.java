package com.athensoft.day06;

public class DemoBean {
	private String name;
	private int age;
	private int score;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * Retrieve or read state of instance or object
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * A mutator
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void encodeName(String name) {
		this.name = "123"+name+"123";
	}

	@Override
	public String toString() {
		return "DemoBean [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	public static void main(String[] args) {
		DemoBean db1 = new DemoBean();
		System.out.println(db1);
		
		db1.setName("Sunflower");
		System.out.println(db1);
	}
	
	
}
