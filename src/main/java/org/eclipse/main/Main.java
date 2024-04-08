package org.eclipse.main;

import org.eclipse.language.Language;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Person p = (Person) context.getBean("p");
		// p.drive();

		Language f = (Language) context.getBean("lang");
		f.direBonjour();
	}
}
