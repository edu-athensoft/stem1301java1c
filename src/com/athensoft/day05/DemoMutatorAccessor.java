package com.athensoft.day05;

public class DemoMutatorAccessor {

	private String name ="UNKNOWN";
	private int age;
	
	
	public static void main(String[] args) {
		DemoMutatorAccessor obj1 = new DemoMutatorAccessor();
		System.out.println(obj1);
		
		
		obj1.setName("Peter");			//Mutator
		String myName = obj1.getName();	//Accessor
		System.out.println("myName ="+ myName);
		
		System.out.println(obj1);
		
		System.out.println(obj1.name);

	}
	
	public void setName(String myName) {
		name = myName;
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "DemoMutatorAccessor [name=" + name + ", age=" + age + "]";
	}
	
	

}
