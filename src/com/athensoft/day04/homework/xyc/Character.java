//package com.Yicheng.Homework.day04;
package com.athensoft.day04.homework.xyc;


/**
 * This class goes in the lane ArrayList as elements, it includes Plants, Zombies and Empty grass
 * @author Yicheng
 *
 */
public class Character {
	private float health;
	private String name;
	
	public Character(float h, String n) {
		this.health = h;
		this.name = n;
	}

	public String getName() {
		return name;
	}
	
	public float changeHealth(float num) {
		if(this.health + num <= 0) {
			System.out.println("You died.");
			die();
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
	
	private void die(){
		
	}
	

}
