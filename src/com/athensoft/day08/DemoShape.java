package com.athensoft.day08;

/**
 * Task:  
 * to create 4 shapes objects
 * 
 * to create 4 shapes objects in red, and they are all squares 
 * 
 * To write code to implement that
 * @author Athens
 *
 */
public class DemoShape {

	public static void main(String[] args) {
		/*
		Shape shape1 = new Shape();
		shape1.setPosX(0);
		shape1.setPosY(0);
		shape1.setShapeType("Square");
		shape1.setColor("Yellow");
		
		Shape shape2 = new Shape();
		shape2.setPosX(0);
		shape2.setPosY(0);
		shape2.setShapeType("Square");
		shape2.setColor("Yellow");
		
		
		Shape shape3 = new Shape();
		shape3.setPosX(0);
		shape3.setPosY(0);
		shape3.setShapeType("Square");
		shape3.setColor("Yellow");
		
		Shape shape4 = new Shape();
		shape4.setPosX(0);
		shape4.setPosY(0);
		shape4.setShapeType("Square");
		shape4.setColor("Yellow");
		*/
		
		// Task1. to create 4 shapes objects arbitrarliy
		Shape shape1 = new Shape(0,0,"triangle","yellow");
		Shape shape2 = new Shape(1,1,"square","red");
		Shape shape3 = new Shape(2,2,"rectangle","blue");
		Shape shape4 = new Shape(3,3,"Polygon","green");
		
		// Task2. to create 4 shapes objects in red, and they are all squares 
		Shape shape5 = new Shape(0,0,"square","red");
		Shape shape6 = new Shape(1,1,"square","red");
		Shape shape7 = new Shape(2,2,"square","red");
		Shape shape8 = new Shape(3,3,"square","red");
		
		
		// default values: shapeType = "square", color="red"
		Shape shape9 = new Shape(4,4);
		Shape shape10 = new Shape(5,5);
		
		// exercise 
		// to design a constructor with only one parameter posX
		// default value of posY = 0
		// default values of shapeType = "square", color="red"
//		Shape shape11 = null;
//		Shape shape12 = null;
		
		Shape shape11 = new Shape(4);
		Shape shape12 = new Shape(5);    
		

		
		
	}

}


class Shape{
	private int posX ;
	private int posY ;
	private String shapeType;		//type
	private String color;
	
	public Shape(int posX, int posY, String shapeType, String color) {
		this.posX = posX;
		this.posY = posY;
		this.shapeType = shapeType;
		this.color = color;
	}
	
	/*
	public Shape(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.shapeType = "square";
		this.color = "color";		
	}*/
	
	public Shape(int posX, int posY) {
//		System.out.println("");
		this(posX,posY, "square", "red");		
	}
	
	public Shape(int posX) { 
		this(posX, 0, "square", "red");
		}
	
	public Shape() {
		
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public String getShapeType() {
		return shapeType;
	}
	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}		
}