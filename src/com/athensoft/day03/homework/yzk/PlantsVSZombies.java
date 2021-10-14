package com.athensoft.day03.homework.yzk;

public class PlantsVSZombies {
	/*Zombies*/
	ConeZombie coneZombie;
	FlagZombie flagZombie;
	PoleVaultingZombie poleVaultingZombie;
	Zombie zombie;
	/*Plants*/
	PeaShooter peaShooter;
	SnowPea snowPea;
	SunFlower sunFlower;
	PotatoMine potatoMine;
	WallNut wallNut;
	
	public static void main(String[] args) {
		getZombies();
		getPlants();
	}
	
	public static void getZombies() {
		System.out.println("===Zombies===");
		
		ConeZombie coneZombie = new ConeZombie();
		coneZombie.move();
		
		FlagZombie flagZombie = new FlagZombie();
		flagZombie.nibble();
		
		PoleVaultingZombie poleVaultingZombie = new PoleVaultingZombie();
		poleVaultingZombie.roar();
		
		Zombie zombie = new Zombie();
		zombie.move();
	}
	
	public static void getPlants() {
		System.out.println("===Plants===");
		
		PeaShooter peaShooter = new PeaShooter();
		peaShooter.shoot();
		
		SnowPea snowPea = new SnowPea();
		snowPea.shoot();
		
		SunFlower sunFlower = new SunFlower();
		sunFlower.produceSunlight();
		
		PotatoMine potatoMine = new PotatoMine();
		potatoMine.explode();
		
		WallNut wallNut = new WallNut();
		wallNut.defend();

		
	}

}
