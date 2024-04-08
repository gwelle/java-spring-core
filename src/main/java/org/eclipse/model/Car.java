package org.eclipse.model;

import org.springframework.stereotype.Component;

@Component("c1")
public class Car {

	public void start() {
		System.out.println("Voiture d'émarrée et prete a rouler");
	}
}
