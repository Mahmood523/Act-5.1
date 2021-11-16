package com.thp.spring.simplecontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXMLMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext.xml");
		
		Moussaillon test = new Moussaillon();
		test =(Moussaillon) context.getBean("moussaillon");
		System.out.println("Le pr�nom du moussaillon :" +test.getLastName());
        System.out.println("Le nom du moussaillon :"+test.getFirstName() );
	    System.out.println("Configuration utilis�e :"+test.getConfig() );
	    System.out.println("Bravo, vous venez de cr�er votre premier contexte Spring en XML!!");
	}

}
