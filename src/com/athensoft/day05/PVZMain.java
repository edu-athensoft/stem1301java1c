package com.athensoft.day05;

public class PVZMain {

	public static void main(String[] args) {
		Peashooter p1 = new Peashooter();
		NormalZombie z1 = new NormalZombie();
		
		
		// distance >0
		final int DAMAGE_PEASHOOTER = 50;		//peashooter
		final int DAMAGE_ZOMBIE = 100;			//zombie
		p1.shoot();		
		z1.getHurt(DAMAGE_PEASHOOTER);
		
		p1.shoot();
		z1.getHurt(DAMAGE_PEASHOOTER);
		
		p1.shoot();
		z1.getHurt(DAMAGE_PEASHOOTER);
		
		
		// distance =0
		z1.bite(p1);
		p1.getHurt(DAMAGE_ZOMBIE);
		
	}

}
