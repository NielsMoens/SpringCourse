package com.luv2code.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class RESTfortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
