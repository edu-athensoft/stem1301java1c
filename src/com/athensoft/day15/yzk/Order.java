package com.athensoft.day15.yzk;

public class Order {
	
	/*Part.1*/
	private String merchantName;
	private String orderNumber;       
	private String orderDate;
	private String orderTime;
	private String customerName;      
	private String receiverName;      
	
	/*Part.2*/
//	private static OrderItem[] cart;
	private static OrderItem[] cart = new OrderItem[99];
	
	private static double subTotal;            // Subtotal before tax
	private int storeItems;
	private static double discount;
	private static double shippingFee;       // Total amount > $50, the shipping fee will be $0. If total amount < $50, the shipping fee will be $25.
	private static double grandTotal;    
	
	/*Part.3*/
	private Status orderState;

	/*Part.1*/
	public Order(String merchantName, String orderNumber, String orderDate, String orderTime, String customerName, String receiverName) {
		this.merchantName = merchantName;
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.customerName = customerName;
		this.receiverName = receiverName;
		
	}
	
	@Override
	public String toString() {
		return "	  Order"
				+ "\n*****************************"
				+ "\nMerchant Name: " + merchantName 
				+ "\nOrder Number: " + orderNumber 
				+ "\nOrder Date: " + orderDate
				+ "\nOrder Time: " + orderTime 
				+ "\nCustomer Name: " + customerName 
				+ "\nReceiver Name: " + receiverName;
	}
	
	
	/*Part.2*/
	public Order() {
		cart = new OrderItem[10];
		return;
	}
	public Order(int cartSize) {
		cart = new OrderItem[cartSize];
		return;
	}	

	public void addItem(OrderItem x) {
		//test by Athens
		System.out.println("storeItems="+storeItems);
		System.out.println("OrderItem x="+x);
		System.out.println("cart="+cart);
		
		
		if(storeItems < cart.length) {
			cart[storeItems] = x;
			storeItems++;
		}else {
			System.out.println("Shopping cart is full !");
		}
		System.out.println("INFO: Order Item-"+x.getItemNo()+"has been added.");
	}
	/*SubTotal*/
	public static double getSubTotal() {
		for(int i = 0 ;i < cart.length;i++) {
			subTotal += cart[i].getAmount();
		}	
		return subTotal;
	}
	
	/*Discount*/
	public static double getDiscount() {
		discount = 0.0;
		return discount;
	}
	
	/*GST*/
	public static double getGST() {
		double GST = TaxRate.getGST();
		return GST;
	}
	/*QST*/
	public static double getQST() {
		double QST = TaxRate.getQST();
		return QST;
	}
	/*Total Tax*/
	public static double getTax() {
		double totalTax = TaxRate.getTax();
		return totalTax;
	}
	
	/*Shipping Fee*/
	public static double getShippingFee() {
		double a = 50.0;
		
		if(getSubTotal() > a) {
			shippingFee = 0.0;
			System.out.println("[If the total amount less $50, the shipping fee will be $25.But if it is reaches than $50, it will be free shipping!]");
			System.out.println("ShippingFee: "+"$"+shippingFee);
		}else{
			shippingFee = 25.0;
			System.out.println("[If the total amount less $50, the shipping fee will be $25.But if it is reaches than $50, it will be free shipping!]");
			System.out.println("ShippingFee: "+"$"+shippingFee);
		}
		return shippingFee;
	}

	/*Grand Total*/
	public static double getGrandTotal() {
		grandTotal = getShippingFee()+TaxRate.getTax()+getSubTotal()-getDiscount();
		return grandTotal;
	}
	
	/*Part.3*/
	/*Status*/
	public void placed() {
		System.out.println("INFO: Order has been placed.");
	}

	public void checkOut() {
		orderState.setPaymentStatus(Status.ORDER_PAID);
		System.out.println("INFO: Paid " +"$"+ grandTotal);
	}
	
	public void notReadyToShip() {
		orderState.setShippingStatus(Status.SHIPPING_READY);
		System.out.println("INFO: Order is not ready to ship.");
	}
	public void readyToShip() {
		orderState.setShippingStatus(Status.SHIPPING_READY);
		System.out.println("INFO: Order is ready to ship.");
	}
	
	public void cancel() {
		if(!orderState.getShippingStatus().equals(Status.SHIPPING_SHIPPED)) {
			orderState.setCheckStatus(Status.ORDER_CANCELED);
			System.out.println("INFO: Order has been canceled.");
		}else {
			System.out.println("INFO: Sorry this order was just shipped(cannot cancel).");
		}
	}
	
	public void shipped(){
		orderState.setShippingStatus(Status.SHIPPING_SHIPPED);
		System.out.println("INFO: Order was just shipped.");
	}
	
	/*Check Status*/
	public void checkStatus() {
		if(orderState.getCheckStatus().equals(Status.ORDER_CANCELED)) {
			System.out.println("This order is canceled.");
			return;
		}
		
		if(orderState.getCheckStatus().equals(Status.ORDER_UNPLACED)) {
			System.out.println("This order has not been placed.");
		}else if(orderState.getCheckStatus().equals(Status.ORDER_PLACED)) {
			System.out.println("This order has been placed.");
		}else {
			System.out.println("Shipping status unavailable.");
		}
		
	}
	public void checkPaymentStatus() {
		if(orderState.getCheckStatus().equals(Status.ORDER_CANCELED)) {
			System.out.println("This order is canceled.");
			return;
		}
		
		if(orderState.getPaymentStatus().equals(Status.ORDER_UNPAID)) {
			System.out.println("This order is unpaid.");
		}else if(orderState.getPaymentStatus().equals(Status.ORDER_PAID)) {
			System.out.println("This order is paid.");
		}
		
	}
	
	public void checkShippingStatus() {
		if(orderState.getCheckStatus().equals(Status.ORDER_CANCELED)) {
			System.out.println("This order is canceled.");
			return;
		}
		
		if(orderState.getShippingStatus().equals(Status.SHIPPING_NOT_READY)) {
			System.out.println("This order is not ready to ship yet.");
		}else if(orderState.getShippingStatus().equals(Status.SHIPPING_READY)) {
			System.out.println("This order is ready to ship.");
		}else if(orderState.getShippingStatus().equals(Status.SHIPPING_SHIPPED)) {
			System.out.println("This order has been shipped.");
		}
		
	}

	
	
	/*Getters & Setters*/
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
}
