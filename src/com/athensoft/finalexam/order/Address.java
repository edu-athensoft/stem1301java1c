package com.athensoft.finalexam.order;

public class Address {
	private String streetNo;
	private String streetName;
	private String suitNo;
	private String city = "Montreal";
	private String province = "Quebec";
	private String country = "Canada";
	private String postalCode;
	
	public Address() {}
	
	public Address(String streeNo, String streetName, String suitNo, String postalCode) {
		this.streetNo = streeNo;
		this.streetName = streetName;
		this.suitNo = suitNo;
		this.postalCode = postalCode;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getSuitNo() {
		return suitNo;
	}

	public void setSuitNo(String suitNo) {
		this.suitNo = suitNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
