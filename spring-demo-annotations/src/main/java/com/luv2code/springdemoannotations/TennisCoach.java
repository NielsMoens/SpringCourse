package com.luv2code.springdemoannotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Qualifier("randomFortuneService")
    @Autowired
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> Tennis Coach: inside default constructor");
    }

    //  define my init method
    @PostConstruct
    public void doMyStart() {
        System.out.println(">> Tennis Coach: inside Do my start ");
    }

    //  define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> Tennis Coach: inside DoMyCleanupStuff");
    }

    // random name also works
//    @Autowired
//    public void Fonsmakker(final FortuneService theFortuneService) {
//        System.out.println(">> Tennis Coach: inside setFortuneService() method");
//        fortuneService = theFortuneService;
//    }

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
