package com.luv2code.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    //
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> Tennis Coach: inside default constructor");
    }

    // define a setter method
    @Autowired
    public void setFortuneService(final FortuneService theFortuneService) {
        System.out.println(">> Tennis Coach: inside setFortuneService() method");
        fortuneService = theFortuneService;
    }

    // constructor injection
//    public TennisCoach(final FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice you B*tch";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
