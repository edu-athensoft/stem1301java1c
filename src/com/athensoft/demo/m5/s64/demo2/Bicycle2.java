package com.athensoft.demo.m5.s64.demo2;

/**
 * Java file: Bicycle2.java
 * @author Athens
 *
 */
public class Bicycle2 {

	private int cadence;
	private int gear;
	private int speed;
	private int id;
	private static int numberOfBicycles = 0;

	public Bicycle2(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;

		// increment number of Bicycles
		// and assign ID number
		id = ++numberOfBicycles;
	}

	// new method to return the ID instance variable
	public int getID() {
		return id;
	}
}
