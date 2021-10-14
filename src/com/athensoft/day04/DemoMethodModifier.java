package com.athensoft.day04;

public class DemoMethodModifier {

	public static void main(String[] args) {
		Bird peter = new Bird();
		peter.eat("bread worm");
		

	}

}

class Bird{
	private String color ;
	private int wing = 2;
	private double weight = 0;
	private double size = 0;
	
	public void eat(String foodName) {
		this.weight += 0.1;
		
	}
	
	private void becomeLarger() {
		// ....
	}

	
}
