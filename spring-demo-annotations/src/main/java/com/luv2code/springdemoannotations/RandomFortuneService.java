package com.luv2code.springdemoannotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //  Create an array of strings
    private final String[] data = {
            "beware of the wolf", "fons makker", "fons de spons"
    };

    //  Create a random number gen
    private final Random myRandom = new Random();

    @Override
    public String getFortune() {
        //  pick a random string from the array
        final int index = myRandom.nextInt(data.length);

        final String theFortune = data[index];
        return theFortune;
    }
}
