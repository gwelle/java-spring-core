package org.eclipse.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lang")
public class Language {

	@Autowired
	@Qualifier("salutationEn")
	private Salutation salutation;

	public void direBonjour() {
		salutation.sayHello();
	}

}
