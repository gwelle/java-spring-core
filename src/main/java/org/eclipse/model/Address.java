package org.eclipse.model;

public class Address {

	private int id;
	private String street;
	private String zipCode;
	private String city;

	public Address(String street, String zipCode, String city) {
		super();
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void display() {
		System.out.println(id + " " + street + " " + zipCode + " " + city + "\n");
	}

}
