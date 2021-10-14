package com.athensoft.day05;

public class NormalZombie {
	private int hp;
	private int speed;
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void getHurt(int damageValue) {
		// TODO - REFINE IT WITH BULLTET CLASS
		this.hp = this.hp - damageValue;	//50 magic number
	}
	
	public void bite(Peashooter peashooter) {
		//
		System.out.println("bite()");
	}
	
}
