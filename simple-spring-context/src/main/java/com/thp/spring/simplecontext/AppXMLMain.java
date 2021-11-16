package com.thp.spring.simplecontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXMLMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext.xml");
		
		Moussaillon test = new Moussaillon();
		test =(Moussaillon) context.getBean("moussaillon");
		System.out.println("Le prénom du moussaillon :" +test.getLastName());
        System.out.println("Le nom du moussaillon :"+test.getFirstName() );
	    System.out.println("Configuration utilisée :"+test.getConfig() );
	    System.out.println("Bravo, vous venez de créer votre premier contexte Spring en XML!!");
	}

}
