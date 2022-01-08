package com.athensoft.day15.xyc;

public class Item {

	private String number;
	private String name;
	private String description;
	private int quantity;
	private double unitPrice;
	private double discount;
	private double amount; // (unit price - discount) * quantity
	
	
	public Item(String number, String name, String description, int quantity, double unitPrice) {
		this.number = number;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}


	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	public double getAmount() {
		amount = unitPrice * quantity;
		
		return amount;
	}
	
	
	
	
	
}
