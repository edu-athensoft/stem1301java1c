package com.athensoft.day03.homework.xyc;

public class Zombie {
	
	private float health;
	private String type;
	
	
	public Zombie(float h, String t) {
		this.health = h;
		this.type = t;
	}
	
	public float changeHealth(float num) {
		if(this.health + num <= 0) {
			System.out.println("You died.");
			return 0;
		}
		else {
			this.health += num;
			return health;
		}
	}
	
	public float getHealth() {
		return this.health;
	}
	
	public String getType() {
		return type;
	}
	
	public void bite() {
		
	}
	
	public void walk() {
		
	}

}
