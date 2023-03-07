package com.luv2code.springdemoone;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(final String emailAddress) {
        System.out.println("CricketCoach : inside setter methode - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(final String team) {
        System.out.println("CricketCoach : inside setter methode - setTeam");
        this.team = team;
    }

    private String emailAddress;
    private String team;

    // create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach : inside no-arg constructor");
        fortuneService = null;
    }

    // our setter method
    public void setFortuneService(final FortuneService fortuneService) {
        System.out.println("CricketCoach: we are in the setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling hoppa";
    }

    @Override
    public String getDailyFortune() {
        return "Hit it " + fortuneService.getFortune();
    }


}
