package org.eclipse.configuration;

import org.eclipse.model.Address;
import org.eclipse.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // ApplicationConfig est définie comme une classe de configuration
@ComponentScan("org.eclipse.nation") // on indique ApplicationConfig l’emplacement de nos composants
public class ApplicationConfig {

	@Bean
	public Person person() {
		Person person = new Person("Guillaume", "WELLE");
		return person;
	}

	@Bean
	public Address address() {
		Address address = new Address("paradis", "13000", "Marseille");
		return address;
	}

	@Bean
	public Person person_address(Address address) {
		Person person_address = new Person("Guillaume", "WELLE", address);
		return person_address;
	}

}
