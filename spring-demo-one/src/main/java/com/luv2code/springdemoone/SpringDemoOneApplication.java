package com.luv2code.springdemoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoOneApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpringDemoOneApplication.class, args);

        //create the object
        final Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}
