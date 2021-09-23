package com.athensoft.demo.m5.s64.demo3;

public class DemoStaticBlock {
	 
    
    public static void main(String args[]) {
    	// Although we don't have an object of Test, static block is 
        // called because i is being accessed in the following statement.
        System.out.println(Test.i);
    }
}


class Test {
    static int i;
    int j;
      
    // start of static block 
    static {
        i = 10;
        System.out.println("static block called ");
    }
    // end of static block 
}