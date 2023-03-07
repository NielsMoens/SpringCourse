package com.luv2code.springdemoone;

public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "HIT THAT BALL";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
