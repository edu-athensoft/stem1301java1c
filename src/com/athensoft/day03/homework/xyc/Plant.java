package com.athensoft.day03.homework.xyc;

public class Plant {
	
	
	private float health;
	
	public Plant(float h) {
		this.health = h;
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

}
