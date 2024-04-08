package org.eclipse.configuration;

import org.eclipse.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // ApplicationConfig est définie comme une classe de configuration
public class ApplicationConfig {

	@Bean
	public Person person() {
		Person person = new Person("Guillaume", "WELLE");
		return person;
	}

}
