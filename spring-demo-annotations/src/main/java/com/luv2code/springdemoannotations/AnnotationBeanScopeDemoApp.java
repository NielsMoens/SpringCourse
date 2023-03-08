package com.luv2code.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(final String[] args) {

        //  load spring config file
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        final Coach theCoach = context.getBean("tennisCoach", Coach.class);
        final Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //  check to see if there the same
        final boolean result = (theCoach == alphaCoach);

        //  print out the results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // close the context
        context.close();
    }
}
