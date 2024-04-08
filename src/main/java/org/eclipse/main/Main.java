package org.eclipse.main;

import org.eclipse.nation.European;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Utilisation de l’usine de bean dans le main
		BeanFactory factory = context;
		European e = (European) context.getBean("french");
		e.saluer();
	}
}
