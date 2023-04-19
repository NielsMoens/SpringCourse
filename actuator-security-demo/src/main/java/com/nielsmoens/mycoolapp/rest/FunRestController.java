package com.nielsmoens.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "hello world"
    @GetMapping("/hello")
    public String sayHello() {
        return "hello world!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run barry run";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "JUST DO it";
    }
}
