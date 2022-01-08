package com.athensoft.day15.yzk;
/**
 * 
 */
public class Status {
	
	/*Place order*/
	public static final String ORDER_UNPLACED = "unplaced";
	public static final String ORDER_PLACED = "placed";
	/*Shipping Status*/
	public static final String SHIPPING_NOT_READY = "not ready to ship";
	public static final String SHIPPING_READY = "ready to ship";
	public static final String SHIPPING_SHIPPED = "shipped";
	
	/*Payment Status*/
	public static final String ORDER_UNPAID = "unpaid";
	public static final String ORDER_PAID = "paid";
	public static final String ORDER_CANCELED = "canceled";

	/*Check Status*/
	private String shippingStatus;
	private String paymentStatus;
	private String checkStatus;
	
	public String getShippingStatus() {
		return shippingStatus;
	}
	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

}
