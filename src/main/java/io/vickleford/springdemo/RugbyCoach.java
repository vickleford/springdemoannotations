package io.vickleford.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public RugbyCoach(FortuneService fs) {
        fortuneService = fs;
    }

    public String getDailyWorkout() {
        return "HURRRRGH! get tougher!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
