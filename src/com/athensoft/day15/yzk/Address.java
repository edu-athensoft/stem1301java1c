package com.athensoft.day15.yzk;

public class Address {
	protected String country;
	protected String province;
	protected String city;
	protected String postalCode;
	protected String street;
	protected int building;
	protected int apt;
	
	public Address(String country, String province, String city, String postalCode, String street, int building, int apt) {
		this.country = country;
		this.province = province;
		this.city = city;
		this.postalCode =postalCode;
		this.street = street;
		this.building = building;
		this.apt = apt;
	}
	
	@Override
	public String toString() {
		return apt +"-"+ building +" "+ street +" "+ city +" "+ province +" "+ country +" "+ postalCode ;
	}


	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public int getBuilding() {
		return building;
	}
	public void setBuilding(int building) {
		this.building = building;
	}
	
	public int getApt() {
		return apt;
	}
	public void setApt(int apt) {
		this.apt = apt;
	}
	
	
}
