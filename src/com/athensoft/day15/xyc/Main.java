package com.athensoft.day15.xyc;

public class Main {
	
	private static final String peterAddress = "9-1000 Boul. Decarie Montreal Quebec H2A 1K3";
	private static final String jackAddress = "3-1500 Boul. Sherbrooke Est. Quebec City, Quebec K1B 2H6";
	

	public static void main(String[] args) {
		
		// ORDER 1
		
		System.out.println("==================\n      ORDER 1     \n==================");
		String orderNumber1 = "202112260002";
		String orderTime1 = "20:00:00";
		String orderDate1 = "12-26-2021";
		String customerName1 = "Peter";
		String receiverName1 = "Peter";
		Order order1 = new Order("ABC.ca", orderNumber1, orderTime1, orderDate1, customerName1, peterAddress, receiverName1);
		
		Item iphone = new Item("101001", "iPhone 13", "5.25\" screen, 64GB memory", 1, 1200d);
		Item usb = new Item("102005", "USB flash drive", "8GB", 2, 14.99d);
		Item book = new Item("201006", "The Art of Code", "", 1, 59.99d);
		
		
		// Order info
		System.out.println("Order number: " + orderNumber1);
		System.out.println("Order time: " + orderTime1);
		System.out.println("Order date: " + orderDate1);
		
		System.out.println("Receiver: " + receiverName1);
		
		
		System.out.println("-------------------");
		//USER
		// Shopping / adding items
		order1.addItem(iphone);
		order1.addItem(usb);
		order1.addItem(book);
		

		
		order1.placeOrder();
		
		order1.checkConfirmationStatus();
		
		order1.pay();
		

		
		//SYSTEM
		// Receipt
		System.out.println("Subtotal: " + order1.getSubtotal() + "$");
		System.out.println("Freight: " + order1.getFreight() + "$");
		System.out.println("Tax: " + order1.getTax() + "$");
		System.out.println("Grand Total: " + order1.getGrandTotal() + "$");
		
		
		
				
		order1.readyToShip();
		order1.ship();
		
		
		//USER
		order1.checkConfirmationStatus();
		order1.checkPaymentStatus();
		order1.checkShippingStatus();
		
		

		
		/////////////////////////////////////////////////////////////////////////
	
		//ORDER 2
		
		System.out.println("==================\n      ORDER 2     \n==================");
		
		
		String orderNumber2 = "202112260002";
		String orderTime2 = "20:30:00";
		String orderDate2 = "12-26-2021";
		String customerName2 = "Peter";
		String receiverName2 = "Jack";
		Order order2 = new Order("ABC.ca", orderNumber2, orderTime2, orderDate2, customerName2, jackAddress, receiverName2);
		
		// Order info
		System.out.println("Order number: " + orderNumber2);
		System.out.println("Order time: " + orderTime2);
		System.out.println("Order date: " + orderDate2);
		System.out.println("Receiver: " + receiverName1);
		
		
		
		Item chocolate = new Item("401002", "Box of chocolate", "12 pieces, 360g", 1,  9.99);
		Item gameDisc1 = new Item("502003", "Game disc 1", "Call of Duty", 1, 11.99);
		Item gameDisc2 = new Item("502003", "Game disc 2", "Elder Scroll", 1, 11.99); // Should have a different item number
		
		
		////// USER
		order2.addItem(chocolate);
		order2.addItem(gameDisc1);
		order2.addItem(gameDisc2);
		
		order2.placeOrder();
		order2.checkConfirmationStatus();
		
		order2.pay();
		
		// Receipt
		System.out.println("Subtotal: " + order2.getSubtotal() + "$");
		System.out.println("Freight: " + order2.getFreight() + "$");
		System.out.println("Tax: " + order2.getTax() + "$");
		System.out.println("Grand Total: " + order2.getGrandTotal() + "$");
		
		order2.checkPaymentStatus();
		
		
	
		////// SYSTEM
		order2.readyToShip();
		
		
		////// USER
		order2.checkShippingStatus();
		
		
		////// SYSTEM
		order2.ship();
		
		
		////// USER
		order2.checkShippingStatus();
		
	

		
		
	}

}
