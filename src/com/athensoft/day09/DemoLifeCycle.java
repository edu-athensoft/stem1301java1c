package com.athensoft.day09;

public class DemoLifeCycle {

	public static int ID = 1001; 
	
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.mymethod();
		
		
		// set to null
		myclass = null;		//better than nothing to send
		
		
	}

}

class MyClass{
	private String name;
	
	public MyClass() {
		this.name = "Athensoft";
		
	}
	
	public void mymethod() {
		
	}
	
	protected void finalize() {
		
	}
}
