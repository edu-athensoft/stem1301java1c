package com.athensoft.finalexam;

public class Quest14 {

	public static void main(String[] args) {
		Cat tomFather = new Cat();
		
//		Cat tom = new Cat();
//		tom.setFather(tomFather);
		
		Cat tom = new Cat(tomFather);
	}

}

class Cat{
	private String name;
	private String color;
	private double age;
	Cat father;
	
	public Cat() {
		
	}
	
	public Cat(Cat father) {
		this.father = father;
	}
	
	public void setFather(Cat father) {
		this.father = father;
	}
	
	public void run() {
		
	}
}
