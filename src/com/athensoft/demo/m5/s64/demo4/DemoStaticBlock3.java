package com.athensoft.demo.m5.s64.demo4;

public class DemoStaticBlock3 {
	 	
	 static {
//	        static int i = 10;  	//error: only final is permitted	        
	        final int a = 1;		//local
			System.out.println("static block executed.");
	    }
	
    public static void main(String args[]) {
    	System.out.println("main()");
//    	System.out.println(DemoStaticBlock2.a); 
    }
}

