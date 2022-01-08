package com.athensoft.day15.xyc;

public class Status {
	public static final String SHIPPED = "Order shipped";
	public static final String READY_TO_SHIP = "Order ready to ship";
	public static final String NOT_READY = "Order not ready to ship";
	public static final String PAID = "Order paid";
	public static final String UNPAID = "Order unpaid";
	public static final String CANCELED = "Order canceled";
	public static final String CART = "Order in cart";
	public static final String PLACED = "Order placed";
	
	
	private String shippingStatus;
	private String PaymentStatus;
	private String confirmation;
	
	public Status() {
		shippingStatus = NOT_READY;
		PaymentStatus = UNPAID;
		confirmation = CART;
	}
	
	public String getConfirmationStatus() {
		return confirmation;
	}
	public void setConfirmationStatus(String confirmation) {
		this.confirmation = confirmation;
	}
	public String getShippingStatus() {
		return shippingStatus;
	}
	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}

	
	

}
