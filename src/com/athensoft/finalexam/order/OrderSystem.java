package com.athensoft.finalexam.order;

public class OrderSystem {
	public static long LAST_ORDER_NO = 202112260000L;

	
    public static long getNextOrderNo() {
    	LAST_ORDER_NO += 1;
        return LAST_ORDER_NO;
    }
}
