package com.athensoft.day15.yzk;

public class OrderClient {
	public static void main(String[] args) {
		/*====Order 1=====*/
		/*Items*/
//		OrderItem(int seqNo, int itemNo, String name, String specification, int quantity, double unitPrice)
		OrderItem iPhone = new OrderItem(1, 101001, "iPhone13 ", "5.25\\\"_64GB memory_black ", 1, 1200.00);
		OrderItem USB = new OrderItem(2, 102005, "USB flash drives ", "8GB ", 2, 14.99);
		OrderItem book = new OrderItem(3, 201006, "Book ", "'The Art of Code' ", 1, 59.99);
		
		/*Information*/
		//Order(String merchantName, String orderNumber, String orderDate, String orderTime, String customerName, String receiverName)
		Order order1 = new Order("ABC.ca", "202112260001", "12-26-2021", "20:00:00", "Peter", "Peter");
		
		System.out.println("**********************************************************");
		
		/*Shopping & addItem*/
		order1.addItem(iPhone);
		order1.addItem(USB);
		order1.addItem(book);
		
		/*Status & Checks*/
		order1.placed();
		order1.checkStatus();
		
		order1.checkOut();
		order1.checkPaymentStatus();
		
		order1.readyToShip();
		order1.checkShippingStatus();
		order1.shipped();
		order1.checkShippingStatus();
		
		System.out.println("**********************************************************");
		System.out.println(order1);
		
		/*Address*/
		//Address(String country, String province, String city, String postalCode, String street, int building, int apt)
		Address address1 = new Address("Canada", "Quebec", "Montreal", "H2A 1K3", "Boul. Decarie", 1000, 9); 
		System.out.println("Bill To:\n"+order1.getCustomerName()+"\n"+address1);
		System.out.println("Ship to:\n"+order1.getReceiverName()+"\n"+address1);
		
		System.out.println("**********************************************************");
		
		System.out.println("Order Items:");
		System.out.println(iPhone);
		System.out.println(USB);
		System.out.println(book);
//		System.out.println(iPhone.getSeqNo()+" "+iPhone.getItemNo()+" "+iPhone.getName()+iPhone.getSpecification()+iPhone.getUnitPrice()+"x"+iPhone.getQuantity()+" => $"+iPhone.getAmount()+"CAD");
//		System.out.println(USB.getSeqNo()+" "+USB.getItemNo()+" "+USB.getName()+USB.getSpecification()+USB.getUnitPrice()+"x"+USB.getQuantity()+" => $"+USB.getAmount()+"CAD");
//		System.out.println(book.getSeqNo()+" "+book.getItemNo()+" "+book.getName()+book.getSpecification()+book.getUnitPrice()+"x"+book.getQuantity()+" => $"+book.getAmount()+"CAD");

		System.out.println("**********************************************************");
		
		System.out.println("SubTotal: "+"$"+order1.getSubTotal());
		System.out.println("Discount: "+"$"+order1.getDiscount());
		System.out.println(order1.getShippingFee());
		System.out.println("GST(5%): "+order1.getGST());
		System.out.println("QST(9.975%): "+order1.getQST());
		System.out.println("Taxes(TPS+TVQ=14.975%): "+"$"+order1.getTax());
		System.out.println("Grand Total: "+"$"+order1.getGrandTotal());
		
		
		
		
		
		
		
		/*====Order 2=====*/
		/*Items*/
//		OrderItem(int seqNo, int itemNo, String name, String specification, int quantity, double unitPrice)
		OrderItem chocolate = new OrderItem(1, 401002, "Chocolate ", "12 pieces 360g ", 1, 9.99);
		OrderItem gameDisc = new OrderItem(2, 502003, "Game discs ", "Call of Duty, Elder Scroll for XBox ", 2, 11.99);
		
		/*Information*/
		//Order(String merchantName, String orderNumber, String orderDate, String orderTime, String customerName, String receiverName)
		Order order2 = new Order("ABC.ca", "202112260002", "12-26-2021", "20:30:00", "Peter", "Jack");
		
		System.out.println("**********************************************************");
		
		/*Shopping & addItem*/
		order2.addItem(chocolate);
		order2.addItem(gameDisc);
		
		/*Status & Checks*/
		order2.placed();
		order2.checkStatus();
		
		order2.checkOut();
		order2.checkPaymentStatus();
		
		order2.readyToShip();
		order2.checkShippingStatus();
		
		System.out.println("**********************************************************");
		System.out.println(order2);
		
		/*Address*/
		//Address(String country, String province, String city, String postalCode, String street, int building, int apt)
		Address address2 = new Address("Canada", "Quebec", "Quebec City", "K1B 2H6", "Sherbrooke Est.", 1500, 3);
		System.out.println("Bill To:\n"+order2.getCustomerName()+"\n"+address1);
		System.out.println("Ship to:\n"+order2.getReceiverName()+"\n"+address2);
		
		System.out.println("**********************************************************");
		
		System.out.println("Order Items:");
		System.out.println(chocolate);
		System.out.println(gameDisc);

		System.out.println("**********************************************************");
		
		System.out.println("SubTotal: "+"$"+order2.getSubTotal());
		System.out.println("Discount: "+"$"+order2.getDiscount());
		System.out.println(order2.getShippingFee());
		System.out.println("GST(5%): "+order2.getGST());
		System.out.println("QST(9.975%): "+order2.getQST());
		System.out.println("Taxes(TPS+TVQ=14.975%): "+"$"+order2.getTax());
		System.out.println("Grand Total: "+"$"+order2.getGrandTotal());

	}
}
