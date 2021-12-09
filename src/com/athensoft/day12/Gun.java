package com.athensoft.day12;

public class Gun {
	
	private String model = "AK47";
	private int bulletCount = 0;
	private final int clipCapacity = 8;
	
	public void addBullet(int N) {
		
		if(bulletCount + N > clipCapacity) { 
			bulletCount = clipCapacity; 
		}else {
			bulletCount += N; 
		}
		System.out.println("Gun is reloaded !");
	}
	
	public void shoot() {
		if(bulletCount > 0) {
			System.out.println("Fire!");
			bulletCount--;
			System.out.println(bulletCount+" bullets left");
			
		}else {
			System.out.println("Gun needs to be reloaded !");
		}
	}
	
	public void setModel(String model){
		this.model = model;
	}

}
