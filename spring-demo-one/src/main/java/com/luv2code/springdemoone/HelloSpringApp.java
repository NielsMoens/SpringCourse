package com.luv2code.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(final String[] args) {

        // load the spring configuration file
        final ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean form spring contrainer
        final Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methodes on the bean
        System.out.println(theCoach.getDailyWorkout());

        // new method for fortunes service
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
