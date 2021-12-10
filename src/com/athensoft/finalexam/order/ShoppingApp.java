package com.athensoft.finalexam.order;

public class ShoppingApp {

	public static void main(String[] args) {
		// addresses
		// 9-1000 Boul. Decarie Montreal Quebec  H2A 1K3
		Address addrPeter = new Address("1000","Boul. Decarie","9","H2A 1K3");
		// 3-1500 Boul. Sherbrooke Est. Quebec City, Quebec  K1B 2H6
		Address addrJack = new Address("1500","Sherbrooke Est.","3","K1B 2H6");
		addrJack.setCity("Quebec City");

		// shopping 1
		Order order1 = new Order();
		OrderItem item11 = new OrderItem(1, "101001", "iPhone13", "5.25\", 64GB memory, black", 1200, 1);
		OrderItem item12 = new OrderItem(2, "102005", "USB flash drive", "8GB", 14.99, 2);
		OrderItem item13 = new OrderItem(3, "201006", "Book", "Art of Code", 59.99, 1);
		order1.addToCart(item11);
		order1.addToCart(item12);
		order1.addToCart(item13);

		// placing order 1
		String customer = "Peter";
		String billAddress = addrPeter.getAddress();
		order1.placeOrder(customer, billAddress);
		// making payment
		order1.checkout();
		// packaging
		order1.packaging();
		// shipping
		order1.ship();
		System.out.println();
		// print out order
		System.out.println(order1.printOrderInfo());
		
		
		// shopping 2
		Order order2 = new Order();
		OrderItem item21 = new OrderItem(1, "401002", "Chocolate", "12pieces 360g", 9.99, 1);
		OrderItem item22 = new OrderItem(2, "502003", "Game disks", "Call of Duty, Elder Scroll", 11.99, 2);
		order2.addToCart(item21);
		order2.addToCart(item22);

		// placing order 2
		customer = "Peter";
		billAddress = addrPeter.getAddress();
		String receiver = "Jack";
		String shipAddress = addrJack.getAddress();
		order2.placeOrder(customer, billAddress, receiver, shipAddress);
		System.out.println(order2.printOrderInfo());
		// making payment
		order2.checkout();
		System.out.println(order2.printOrderInfo());
		// packaging
		order2.packaging();
		System.out.println(order2.printOrderInfo());
		// shipping
		order2.ship();
		// order2.cancelOrder()
		System.out.println();
		// print out order
		System.out.println(order2.printOrderInfo());

	}

}
