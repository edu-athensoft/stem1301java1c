package com.athensoft.finalexam;

public class PC {
//	private String ram = "2 x 8GB DDR3 memory";
//	
//	private String ramName = "";
//	private int ramQty = 2;
	
	private RAM[] ramList = {new RAM(), new RAM()};
	
	public boolean connect2Ethernet(ConnMethodWireless wifi) {
		boolean status = false;
		return status;
	}
	
	public boolean connect2Ethernet(ConnMethodCable ethernet) {
		boolean status = false;
		return status;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ConnMethodWireless {
	
}

class ConnMethodCable {
	
}

class RAM{
	private String spec = "";
	
}

