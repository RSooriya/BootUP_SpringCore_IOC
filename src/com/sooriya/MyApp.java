package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
        // creating Spring container and loading configuration file into container
		ClassPathXmlApplicationContext context = new 
				 ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieving bean from container
        Coach theCoach = context.getBean("myCoach",Coach.class);
		//calling methods on bean
        System.out.println(theCoach.getDailyWorkout());
	}

}
