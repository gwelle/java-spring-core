package org.eclipse.main;

import org.eclipse.configuration.ApplicationConfig;
import org.eclipse.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Person person = context.getBean("person", Person.class);
		person.display();
	}
}
