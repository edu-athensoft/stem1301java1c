//package com.Yicheng.Homework.day04;
package com.athensoft.day04.homework.xyc;

import java.util.concurrent.TimeUnit;

import com.athensoft.day04.homework.xyc.plant.PeaShooter;
import com.athensoft.day04.homework.xyc.plant.Sunflower;
import com.athensoft.day04.homework.xyc.plant.Wallnut;
import com.athensoft.day04.homework.xyc.zombie.ConeHeadZombie;
import com.athensoft.day04.homework.xyc.zombie.NormalZombie;
import com.athensoft.day04.homework.xyc.zombie.PoleVaultingZombie;
import com.athensoft.day04.homework.xyc.zombie.Zombie;

public class Main {

	public static Lane mainLane;
	private static Zombie zombie;
	public static boolean zombieOrNot;

	public static void main(String[] args) {
		start();
	}
	
	private static void start() {
		mainLane = new Lane();
		mainLane.addPlant(new Sunflower(), 0);
		mainLane.addPlant(new PeaShooter(), 1);
		mainLane.addPlant(new Wallnut(), 2);
		// Add the starting plants
		
		mainLane.printLane();
		
		for(int i = 0; i < 10; i++) {
			// Update the game every second
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			update(i);
		}
	}
	
	private static void update(int i) {
	
		if(!zombieOrNot) {
			// If there are no zombies on the lane
			// Add a random zombie at the end of the lane
			switch((int)Math.floor(Math.random()*3)) {
			case 0:
				mainLane.spawnZombie(new NormalZombie());
				break;
			case 1:
				mainLane.spawnZombie(new PoleVaultingZombie());
				break;
			case 2:
				mainLane.spawnZombie(new ConeHeadZombie());
				
			}
			
			zombieOrNot = true;
			
			
			
		}else {
			// If there's a zombie on the lane
			if(i % 2 == 1) {
				// TODO move forward every 2 seconds
				
			}
			
			if(mainLane.lane.get(1).getName().equals("P")) {
				mainLane.lane.get(1).changeHealth(-25);
			}
			
			
			
		}
		mainLane.printLane();
	}

}
