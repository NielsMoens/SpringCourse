package com.luv2code.springdemoone.practice;

import com.luv2code.springdemoone.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeTwoHelloSpringApp {

    public static void main(final String[] args) {

        // load the spring configuration file
        final ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        final Coach theCoach = context.getBean("myGolfCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}







