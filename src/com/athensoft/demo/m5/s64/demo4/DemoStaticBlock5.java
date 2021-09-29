package com.athensoft.demo.m5.s64.demo4;

public class DemoStaticBlock5 {
	 public static void main(String args[]) {
		  
	       // Although we have two objects, the static block is executed only once.
	       Test2 t1 = new Test2();
	       Test2 t2 = new Test2();
	    }
}

class Test2 {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called ");
    }
    Test2(){
        System.out.println("Constructor called");
    }
}

