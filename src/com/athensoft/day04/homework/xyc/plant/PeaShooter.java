//package com.Yicheng.Homework.day04;
package com.athensoft.day04.homework.xyc.plant;

import com.athensoft.day04.homework.xyc.Main;

public class PeaShooter extends Plant{
	private static int damage = 25;

	public PeaShooter() {
		super(100, "P");
	}
	
	public void shoot(){
		for(int i = 0; i < Main.mainLane.lane.size()-1; i++) {
			if(Main.mainLane.lane.get(i).getName().equals("PZ") || Main.mainLane.lane.get(i).getName().equals("NZ") || Main.mainLane.lane.get(i).getName().equals("CZ")) {
				Main.mainLane.lane.get(i).changeHealth(damage);
			}
		}
	}
	
	
	

}
