package org.eclipse.language;

import org.springframework.stereotype.Component;

@Component
public class SalutationEn implements Salutation {

	@Override
	public void sayHello() {
		System.out.println("In english we say hello");
	}
}