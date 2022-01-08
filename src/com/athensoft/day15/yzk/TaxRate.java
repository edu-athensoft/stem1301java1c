package com.athensoft.day15.yzk;

public class TaxRate {
	
	private static double GST;              // GST(5%)
	private static double QST;   			// QST(9.975%)
	private static double totalTax;			// GST(5%) + QST(9.975%) = 14.975%
	
	/*GST*/
	public static double getGST() {
		GST = Order.getSubTotal()*0.05;
		return GST;
	}
	
	/*QST*/
	public static double getQST() {
		QST = Order.getSubTotal()*0.0975;
		return QST;
	}
	
	/*Total Tax*/
	public static double getTax() {
		totalTax = Order.getSubTotal()*0.14975;
		return totalTax;
	}
}
