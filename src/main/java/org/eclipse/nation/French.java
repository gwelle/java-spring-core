package org.eclipse.nation;

import org.springframework.stereotype.Component;

@Component("fra") // Décorateur pour déclarer un bean
public class French implements European {

	public French() {
		System.out.println("Constructor");
	}

	@Override
	public void saluer() {
		System.out.println("Bonjour");
	}
}