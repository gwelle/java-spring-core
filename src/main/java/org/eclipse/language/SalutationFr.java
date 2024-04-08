package org.eclipse.language;

import org.springframework.stereotype.Component;

@Component
public class SalutationFr implements Salutation {

	@Override
	public void sayHello() {
		System.out.println("En français, on dit bonjour.");
	}

}
