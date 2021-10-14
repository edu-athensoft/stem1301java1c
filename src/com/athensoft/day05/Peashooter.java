package com.athensoft.day05;

public class Peashooter {
	private int hp;
	private int cost;
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public void shoot() {
		//stub
		System.out.println("shoot()");
	}
	
	public void getHurt(int damageValue) {
		//stub
		System.out.println("getHurt()");
		this.hp = this.hp - damageValue;	//50 magic number
	}
}
