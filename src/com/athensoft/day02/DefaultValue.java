package com.athensoft.day02;

public class DefaultValue {

	//default value is ' '
	private char myChar;
	
	public char getMyChar() {
		return myChar;
	}

	public void setMyChar(char myChar) {
		this.myChar = myChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultValue dv = new DefaultValue();
		System.out.println("|"+dv.getMyChar()+"|");
	}

}
