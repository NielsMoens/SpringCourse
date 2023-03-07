package com.luv2code.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(final String[] args) {

        // load the spring configuration file
        final ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        final Coach theCoach = context.getBean("myCoach", Coach.class);

        // Display the results
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
