package com;

public class Address {
	int pincode;
	String landmark;
	int houseno;
	public Address(int pincode, String landmark, int houseno) {
		super();
		this.pincode = pincode;
		this.landmark = landmark;
		this.houseno = houseno;
	}
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", landmark=" + landmark + ", houseno=" + houseno + "]";
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	
	

}
