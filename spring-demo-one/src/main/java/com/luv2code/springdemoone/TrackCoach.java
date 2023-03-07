package com.luv2code.springdemoone;

public class TrackCoach implements Coach {

    private final FortuneService fortuneService;

    public TrackCoach() {

        fortuneService = null;
    }

    public TrackCoach(final FortuneService fortuneService) {
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
