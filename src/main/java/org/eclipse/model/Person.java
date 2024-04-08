package org.eclipse.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private Address address;
	private List<String> sports;

	@Autowired // cherche les beans selon le type.
	@Qualifier("c1") // Pour chercher un bean selon le nom, il faut utiliser l’annotation
	Car c;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSports() {
		return sports;
	}

	public void setSports(List<String> sports) {
		this.sports = sports;
	}

	public void display() {
		System.out.println(id + " " + firstName + " " + lastName + " " + address.getStreet() + " "
				+ address.getZipCode() + " " + address.getCity() + " \n");
		System.out.println("My sports : ");
		sports.forEach(System.out::println);
	}

	public void drive() {
		System.out.println("Je suis pret a conduire");
		c.start();
	}
}
