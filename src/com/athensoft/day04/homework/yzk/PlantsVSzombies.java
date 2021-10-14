package com.athensoft.day04.homework.yzk;

public class PlantsVSzombies {
	
	/*Ex.Zombie*/
	Zombie zombie;
	/*Ex.Plant*/
	PeaShooter peaShooter;
	
	public static void main(String[] args) {
		PeaShooter peaShooter = new PeaShooter();
		peaShooter.shoot("bullet");
		peaShooter.decreaseLive1(300);
		
		Zombie zombie = new Zombie();
		zombie.nibble("plants");
		zombie.decreaseLive2(270);
	}
}

class PeaShooter{
	
	private double healthPoint = 300;
	private int damage = 20;
	private int price = 100;
	
	public void shoot(String Name) {
		System.out.println("I'm the pea shooter:");
		System.out.println("I shoot zombies...");
	}
	
	void decreaseLive1(int healthPoint) {
		System.out.println("Zombie healthPoint = "+healthPoint);
		
		for (int i=healthPoint; i>=0; i-=damage) {
			System.out.println(i);
			
			if(i==0) {
				System.out.println("Zombie is killed by the pea shooter...\n");
			}
		}
	}
}

class Zombie{
	
	int healthPoint = 270;
	int damage = 100;
	
	public void nibble(String Name) {
		System.out.println("I'm the zombie:");
		System.out.println("I nibble plants...");
	}
	
	public void decreaseLive2(int healthPoint) {
		System.out.println("Pea shooter healthPoint = "+healthPoint);
		
		for (int i=healthPoint; i>=0; i-=damage) {
			System.out.println(i);
			
			if(i<99) {
				System.out.println(0);
				System.out.println("Pea shooter is killed by the zombie...");
			}
		}
	}
}
