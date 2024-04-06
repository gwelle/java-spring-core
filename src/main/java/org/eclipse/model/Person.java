package org.eclipse.model;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private Address address;

	public Person(int id, String firstName, String lastName, Address address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public void display() {
		System.out.println(id + " " + firstName + " " + lastName + " " + address);
	}
}
