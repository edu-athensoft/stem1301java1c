package com.athensoft.day15.xyc;

import java.util.ArrayList;

public class Order {
	private Status status;
	private String merchant; // name
	private String orderNumber; // 12 digits
	private String orderTime; // HH:MM:SS
	private String orderDate; // DD-MM-YYYY
	private String customer; // name
	private String billingAddress;
	private String receiver; // name
	private double subtotal; // Before tax
	private int discount; // percentage
	private double freight; // Shipping, free when subtotal reaches 50$, otherwise freight = 25$
	private double tax; // Based on subtotal and discount   ( Subtotal -   discount ) * 0.01475
	private double grandTotal; // Subtotal - Subtotal of Discount + tax + freight
	private ArrayList<Item> items;
	
	
	
	
	public Order(String merchant, String orderNumber, String orderTime, String orderDate, String customer, String billingAddress, String receiver, int discount) {
		this.status = new Status();
		this.merchant = merchant;
		this.orderNumber = orderNumber;
		this.orderTime = orderTime;
		this.setOrderDate(orderDate);
		this.customer = customer;
		this.setBillingAddress(billingAddress);
		this.receiver = receiver;
		this.items = new ArrayList<Item>();
		this.discount = discount;
	}
	
	
	//If there's no discount
	public Order(String merchant, String orderNumber, String orderTime, String orderDate, String customer, String billingAddress, String receiver) {
		this(merchant, orderNumber, orderTime, orderDate, customer, billingAddress, receiver, 0);
	}
	
	
	public void placeOrder() {
		status.setConfirmationStatus(Status.PLACED);
		System.out.println("INFO: Order placed.");
	}
	

	public void pay() {
		status.setPaymentStatus(Status.PAID);
		System.out.println("INFO: Paid " + grandTotal + "$");
	}
	
	public void cancel() {
		if(!status.getShippingStatus().equals(Status.SHIPPED)) {
			status.setConfirmationStatus(Status.CANCELED);
			System.out.println("INFO: Item canceled.");
		}else {
			System.out.println("INFO: Item already shipped, cannot cancel.");
		}
	}
	
	public void readyToShip() {
		status.setShippingStatus(Status.READY_TO_SHIP);
	}
	
	public void ship(){
		status.setShippingStatus(Status.SHIPPED);
	}
	
	public void checkPaymentStatus() {
		System.out.println("-------------------");
		String payment = status.getPaymentStatus();
		String cancelation = status.getConfirmationStatus();
		
		if(cancelation.equals(Status.CANCELED)) {
			System.out.println("Your order is canceled.");
			return;
		}
		
		
		if(payment.equals(Status.UNPAID)) {
			System.out.println("Your order is unpaid.");
		}else if(payment.equals(Status.PAID)) {
			System.out.println("Your order is paid");
		}else {
			System.out.println("Payment status unavailable.");
		}
		
	}
	
	public void checkShippingStatus() {
		String shipping = status.getShippingStatus();
		String confirmation = status.getConfirmationStatus();
		System.out.println("-------------------");
		
		if(confirmation.equals(Status.CANCELED)) {
			System.out.println("Your order is canceled.");
			return;
		}
		
		
		if(shipping.equals(Status.NOT_READY)) {
			System.out.println("Your order is not ready to ship yet.");
		}else if(shipping.equals(Status.READY_TO_SHIP)) {
			System.out.println("Your order is ready to ship");
		}else if(shipping.equals(Status.SHIPPED)) {
			System.out.println("Your order has been shipped");
		}else {
			System.out.println("Shipping status unavailable.");
		}
		
		
	}
	
	public void checkConfirmationStatus() {
		String confirmation = status.getConfirmationStatus();
		System.out.println("-------------------");
		
		if(confirmation.equals(Status.CANCELED)) {
			System.out.println("Your order is canceled.");
			return;
		}
		
		
		if(confirmation.equals(Status.CART)) {
			System.out.println("Your order is in your shopping cart");
		}else if(confirmation.equals(Status.PLACED)) {
			System.out.println("Your order has been placed");
		}else {
			System.out.println("Shipping status unavailable.");
		}
		
	}
	
	
	public void addItem(Item i) {
		items.add(i);
		
		
		// update prices
		updateSubtotal();
		updateFreight();
		updateTax();
		updateGrandTotal();
		
		// Print out items
		System.out.print(itemCount() + ", ");
		
		System.out.println(i.getName()+" | "+i.getDescription()+" | "+i.getQuantity()+" units | "+i.getUnitPrice());
		

	}
	
	public int itemCount() {
		return items.size();
	}
	
	public void updateSubtotal() {
		subtotal = 0;
		
		for(int i = 0; i < items.size(); i++) {
			subtotal += items.get(i).getAmount();
		}
	}
	
	public void updateFreight() {
		freight = getSubtotal() >= 50 ? 0 : 25; 
	}
	
	public void updateTax() {
		tax = (getSubtotal() - (getSubtotal()*discount)) * (TaxRate.GST + TaxRate.QST);
		
		tax = Math.round(tax*100d) / 100d;
	}
	
	
	public void updateGrandTotal() {
		grandTotal = getSubtotal() - (getSubtotal()*discount) + getTax() + getFreight();
	}
	
		
	public double getFreight() {
		return freight;
	}
	

	public double getSubtotal() {
		return subtotal;
	}
	
	public double getTax() {
		return tax;
	}
	
	public double getGrandTotal() {
		return grandTotal;  
	}
	



	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
