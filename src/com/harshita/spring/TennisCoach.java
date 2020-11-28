package com.harshita.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Hey Play Tennis Today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
