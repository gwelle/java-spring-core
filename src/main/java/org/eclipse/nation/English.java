package org.eclipse.nation;

import org.springframework.stereotype.Component;

@Component("eng")
public class English implements European {

	@Override
	public void saluer() {
		System.out.println("Hello");
	}

}
