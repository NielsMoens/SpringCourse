package com.luv2code.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private final FortuneService fortuneService;

    @Autowired
    public TennisCoach(final FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice you B*tch";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
