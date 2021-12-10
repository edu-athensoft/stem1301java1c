package com.athensoft.finalexam.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String merchant = "ABC.ca";
	private long orderno = 0L;
	private String orderdate = "mm-dd-yyyy";
	private String ordertime = "00:00:00";
	private String customer ;
	private String billaddr ;
	private String receiver ;
	private String shippingaddr ;
	private double subtotal = 0;
    private double freight = 0;
	private double tax_gst = 0;
	private double tax_qst = 0;
	private double tax_total = 0;
	private double grandtotal = 0;
	private String orderstatus = Status.ORDER_UNPAID;
	private String shippingstatus = Status.SHIPPING_NOT_READY;
	private String paymentmethod = "unknown";
	private List<OrderItem> itemlist = new ArrayList<>();
	
	public void addToCart(OrderItem orderItem) {
        this.itemlist.add(orderItem);
        System.out.println("INFO: Order Item-"+orderItem.getItemNo()+" has been added.");
	}
	
	public void placeOrder(String customer, String billAddr, String receiver, String shippingAddr) {
        this.orderno = OrderSystem.getNextOrderNo();
        this.orderdate = "12-26-2021";
        this.ordertime = "20:00:00";
        this.customer = customer;
        this.billaddr = billAddr;
        if(receiver == null || receiver.isEmpty()){
            this.receiver = this.customer;
        }else{
            this.receiver = receiver;
        }
        if(shippingAddr == null || shippingAddr.isEmpty()) {
            this.shippingaddr = "The same as bill-to address";
        }else {
            this.shippingaddr = shippingAddr;
        }
        this.orderstatus = Status.ORDER_UNPAID;
        this.subtotal = this.getSubTotal();
        this.tax_gst = this.getTaxGst();
        this.tax_qst = this.getTaxQst();
        this.tax_total = this.getTax();
        this.freight = this.getFreight();
        this.grandtotal = this.getGrandTotal();
        System.out.println("INFO: Order-"+this.orderno+" has been placed.");
	}
	
	public void placeOrder(String customer, String billAddr) {
		this.placeOrder(customer, billAddr, "", "");
	}
	
	public void checkout() {
        this.orderstatus = Status.ORDER_PAID;
        System.out.println("INFO: Order-"+this.orderno+" has been paid.");
	}

	public void cancelOrder() {
        if(this.shippingstatus != Status.SHIPPING_SHIPPED) {
        	this.orderstatus = Status.ORDER_CANCELED;
            System.out.println("INFO: Order-"+this.orderno+" has been canceled.");
        }else{
        	System.out.println("INFO: Order-"+this.orderno+" cannot be canceled.");
        }
	}
	
	public void packaging() {
        this.shippingstatus = Status.SHIPPING_READY;
        System.out.println("INFO: Order-"+this.orderno+" is ready to ship.");
	}
	
	public void ship() {
        String current_shippingstatus = this.shippingstatus.toLowerCase();
        if(current_shippingstatus == Status.SHIPPING_READY) {
            this.shippingstatus = Status.SHIPPING_SHIPPED;
            System.out.println("INFO: Order-"+this.orderno+" was just shipped.");
        }
        else if(current_shippingstatus == Status.SHIPPING_NOT_READY) {
        	System.out.println("INFO: Order-"+this.orderno+" cannot been shipped due to it is not ready.");
        }
        else if(current_shippingstatus == Status.SHIPPING_SHIPPED) {
        	System.out.println("INFO: Order-"+this.orderno+" has been shipped.");
        }
	}
	
	public String getOrderStatus() {
        return this.orderstatus;
    }
	
    public String getShippingStatus() {
        return this.shippingstatus;
	}

    public double getGrandTotal() {
        return this.getSubTotal()+this.getFreight()+this.getTax();
    }

    public double getSubTotal() {
        double subtotal = 0;
        for(OrderItem item : this.itemlist) {
            subtotal += item.getItemAmount();
        }
        return subtotal;
	}

    public double getFreight() {
        double f = 25.0;
        if(this.getSubTotal() >= 50) {
            f = 0;
        }
        return f;
    }
    
    public double getTax() {
        double tax = this.getTaxGst() + this.getTaxQst();
        return tax;
    }

    public double getTaxGst() {
        return this.getSubTotal() * TaxRate.GST;
	}

    public double getTaxQst() {
        return this.getSubTotal() * TaxRate.QST;
    }

    public String getStatus() {
    	String status = "";
        if(this.orderstatus.toLowerCase() != Status.ORDER_CANCELED || this.orderstatus.toLowerCase() != Status.ORDER_UNPAID) {
            status = this.orderstatus+", "+this.shippingstatus;
        }else{
            status = this.orderstatus;
        }
        return status;
    }
    
    public String printOrderInfo() {
        String title = "=======================\n";
        title += this.merchant+"\t\tORDER\n";
        title += "=======================\n";
        String content = "Order no.:\t"+this.orderno+"\n";
        content += "Order date:\t"+this.orderdate+"\n";
        content += "Order time:\t"+this.ordertime+"\n";
        content += "Bill To: \t"+this.customer+"\n";
        content += "         \t"+this.billaddr+"\n";
        content += "Ship to: \t"+this.receiver+"\n";
        content += "         \t"+this.shippingaddr+"\n";
        String detail = "-----------------------\n";
        for (OrderItem item : this.itemlist) {
            detail += item.getItemInfo()+"\n";
        }
        String summary = "-----------------------\n";
        summary += "Subtotal:\t$"+String.format("%.2f",this.subtotal)+"\n";
        summary += "Freight:\t$"+String.format("%.2f",this.freight)+"\n";
        summary += "GST @"+TaxRate.GST +" \t$"+String.format("%.2f",this.tax_gst)+"\n";
        summary += "QST @"+TaxRate.QST +" \t$"+String.format("%.2f",this.tax_qst)+"\n";
        summary += "Tax:\t\t$"+String.format("%.2f",this.tax_total)+"\n";
        summary += "Grand Total:\t$"+String.format("%.2f", this.grandtotal)+"\n";
        String status = "-----------------------\n";
        status += this.getStatus().toUpperCase() + "\n";
        status += "-----------------------\n";
        return title+content+detail+summary+status;
    }
}
