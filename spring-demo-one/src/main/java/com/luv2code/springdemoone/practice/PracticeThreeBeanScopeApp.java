package com.luv2code.springdemoone.practice;

import com.luv2code.springdemoone.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeThreeBeanScopeApp {

    public static void main(final String[] args) {

        // load the spring configuration file
        final ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        final Coach theCoach = context.getBean("myGolfCoach", Coach.class);

        final Coach alphaCoach = context.getBean("myGolfCoach", Coach.class);

        // check if they are the same
        final boolean result = (theCoach == alphaCoach);

        // Display the results
        System.out.println("\nPointing to the same Object: " + result);

        System.out.println("\nMemory location of theCoach: " + theCoach);

        System.out.println("\nMemory location of alpha: " + alphaCoach);

        // close the context
        context.close();
    }
}







