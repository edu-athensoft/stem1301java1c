package com.athensoft.finalexam.order;

public class OrderItem {
	private int seqNo;
	private String itemNo;
	private String itemName;
	private String itemDesc;
	private double unitPrice;
	private int qty;
	
	public OrderItem(int seqNo, String itemNo, String itemName, String itemDesc, double unitPrice, int qty) {
		super();
		this.seqNo = seqNo;
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}
	
	public OrderItem() {
	}
	
	public double getItemAmount() {
        return this.unitPrice * this.qty;
	}

	public String getItemInfo() {
        return this.seqNo+" "+this.itemNo+" "+this.itemName+" \t| "+this.itemDesc+" |\t$"+this.unitPrice+" "+this.qty+" \t$"+this.getItemAmount();
	}

	public String getItemNo() {
        return this.itemNo;
	}
}
