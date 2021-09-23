package com.athensoft.demo.m5.s62;

public class DemoModifierApp {

	public static void main(String[] args) {
		
		System.out.println("=== access public field ===");
		
		//access public field
		DemoPublicField dpf = new DemoPublicField();
		System.out.println(dpf.pubName);	//access directly!
		dpf.pubName = "New PublicName";		//modify directly!
		System.out.println(dpf.pubName);	//access directly!
		
		System.out.println();
		
		
		System.out.println("=== access private field ===");
		//access private field
		//anti-example
		DemoPrivateField dvf = new DemoPrivateField();
//		System.out.println(dvf.prvtName);	//access directly! ERROR!
//		dvf.prvtName = "New PrivateName";	//modify directly! ERROR!
//		System.out.println(dvf.prvtName);	//access directly! ERROR!
		
		//access private field
		System.out.println(dvf.getPrvtName());	//access directly! ERROR!
		dvf.setPrvtName("New PrivateName"); 	//modify directly! ERROR!
		System.out.println(dvf.getPrvtName());	//access directly! ERROR!
		

	}

}
