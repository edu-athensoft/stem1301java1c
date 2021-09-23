package com.athensoft.demo.m5.s64.demo2;

public class Bicycle {
    
    private int cadence;
    private int gear;
    private int speed;
        
    // add an instance variable for the object ID
    private int id;
    
    // add a class variable for the
    // number of Bicycle objects instantiated
    public static int numberOfBicycles = 0;
    
    public Bicycle(int cadence, int speed, int gear) {
    	this.cadence = cadence;
    	this.gear = gear;
    	this.speed = speed;
    }

	@Override
	public String toString() {
		return "Bicycle [cadence=" + cadence + ", gear=" + gear + ", speed=" + speed + "]";
	}
    
    
}