//package com.Yicheng.Homework.day04;
package com.athensoft.day04.homework.xyc;

import java.util.ArrayList;

import com.athensoft.day04.homework.xyc.plant.Plant;
import com.athensoft.day04.homework.xyc.zombie.Zombie;

public class Lane {
	
	public ArrayList<Character> lane = new ArrayList<>();
	
	
	public Lane() {
		for(int i = 0; i < 9; i++) {
			lane.add(new Empty(" ")); // Adding 9 Empty grass 
		}
	}
	
	public void addPlant(Plant plant, int index) {
	
		lane.set(index, plant); // Changing Object from Empty to a certain Plant
		
	}
	
	public void spawnZombie(Zombie zombie) {
		lane.set(8, zombie);
			
		// Zombies spawn one at a time, spawns another from the end when the old one dies
	}
	
	public void printLane() {
		System.out.print("[");
		
		for(int i = 0; i < lane.size(); i++) {
			if(i < lane.size()-1)
				System.out.print(lane.get(i).getName() + ",");
			else {
				System.out.print(lane.get(i).getName());
			}
		}
		
		System.out.print("]\n");
	}

}
