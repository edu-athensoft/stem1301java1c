package com.athensoft.day06;

public class Duck {
	
	private String name;
	private String color;
	
	public Duck() {
		
	}

	public Duck(String name) {
		this.name = name;
	}
	
	public Duck(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", color=" + color + "]";
	}
	
	
	
}
