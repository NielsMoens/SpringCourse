package com.luv2code.springdemoone;

public class GolfCoach implements Coach {

    private final FortuneService fortuneService;

    public GolfCoach() {

        fortuneService = null;
    }

    public GolfCoach(final FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run barry run";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}
