package org.eclipse.main;

import org.eclipse.configuration.ApplicationConfig;
import org.eclipse.model.Person;
import org.eclipse.nation.European;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Person person = context.getBean("person_address", Person.class);
		person.display();

		European e1 = (European) context.getBean("fra");
		e1.saluer();

		European e2 = (European) context.getBean("fra");
		e2.saluer();
		
		System.out.println("e1 == e2 : " + (e1 == e2));
		System.out.println("@e1 : " + e1);
		System.out.println("@e2 : " + e2);
	}
}
