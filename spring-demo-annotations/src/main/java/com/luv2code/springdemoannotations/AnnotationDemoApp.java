package com.luv2code.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(final String[] args) {

        // read spring config file
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        final Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
