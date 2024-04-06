package org.eclipse.model;

import java.util.List;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private Address address;
	private List<String> sports;

	public Person(int id, String firstName, String lastName, Address address, List<String> sports) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.sports = sports;
	}

	public void display() {
		System.out.println(id + " " + firstName + " " + lastName + " " + address + "\n");
		System.out.println("My sports : ");
		sports.forEach(System.out::println);
	}
}
