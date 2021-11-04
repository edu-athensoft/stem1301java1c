package com.athensoft.day08;

public class DemoFinalRefType {

	private Dog dog1 ;
	
	
	public static void main(String[] args) {
		DemoFinalRefType dfrt = new DemoFinalRefType();
		dfrt.checkDog();
		
		final Dog dog2 = new Dog();
		dog2.setName("Peter");
		dog2.setAge(2);
		System.out.println(dog2);
		
		// because the string is immutable
		final String s1 = "abc";
//		s1 = "ccc";   //ERROR
		
		
	}
	
	public void checkDog() {
		this.dog1 = new Dog();
		System.out.println(this.dog1);
	}	

}

class Dog{
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
