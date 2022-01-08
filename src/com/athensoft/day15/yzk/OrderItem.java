package com.athensoft.day15.yzk;

public class OrderItem {
	private int seqNo;
	private int itemNo;
	private String name;
	private String specification;
	private int quantity;
	private double unitPrice;
	private double amount;       //(amount = unit price x quantity)
	
	
	public OrderItem(int seqNo, int itemNo, String name, String specification, int quantity, double unitPrice) {
		this.seqNo = seqNo;
		this.itemNo = itemNo;
		this.name = name;
		this.specification = specification;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		amount = quantity*unitPrice;
	}
	
	
	@Override
	public String toString() {
		return seqNo +" "+ itemNo +" "+ name +" "+ specification +" "+ unitPrice +"x"+ quantity +" => $"+ amount+"CAD";
	}


	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
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
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
