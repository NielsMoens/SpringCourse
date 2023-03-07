package com.luv2code.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {
    public static void main(final String[] args) {

        // load the spring configuration file
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from spring container
        final CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call the methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }
}
