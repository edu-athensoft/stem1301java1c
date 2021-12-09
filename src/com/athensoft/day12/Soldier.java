package com.athensoft.day12;

/**
 * Soldier:
 * fire():
 * Soldier checks if there is a gun in the hand/if not, he says ("stay in position")  ok
 * When the war start, he yells  ok
 * He reloads the gun ok
 * He fires a shot  ok
 * 
 */
public class Soldier {
	
	private Gun gun;
	private boolean getGun = true;

	public static void main(String[] args) {
		Soldier s1 = new Soldier();
		s1.fire();
	}
	
	public void fire(){
		if(getGun) {
			System.out.println("Let's go !!!");
			gun.addBullet(8);
			gun.shoot();
		}else {
			System.out.println("No gun, stay in position");
		}
	}

}