package com.luv2code.springdemoone;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private final FortuneService fortuneService;

    // define a constructor  for the dependency injection
    public BaseballCoach(final FortuneService theForturneService) {
        fortuneService = theForturneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Lets get moving";
    }

    @Override
    public String getDailyFortune() {
        
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
