//package com.Yicheng.Homework.day04;
package com.athensoft.day04.homework.xyc.zombie;

import com.athensoft.day04.homework.xyc.Character;

public class Zombie extends Character{
	public static String[] zombiesList = {"ZN", "ZP", "ZC"};


	private int position = 8;
	
	
	public Zombie(float h, String n) {
		super(h, n);
	}

	
	public void bite() {
		
	}
	
	public void walk() {
		
	}
	

	public int getPosition() {
		return position;
	}

}
