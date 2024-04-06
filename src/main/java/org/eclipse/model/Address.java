package org.eclipse.model;

public class Address {
	
	private int id;
	private String street;
	private String zipCode;
	private String city;
	
	public Address(String street, String zipCode, String city) {
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", zipCode=" + zipCode + ", city=" + city + "]";
	}

}
