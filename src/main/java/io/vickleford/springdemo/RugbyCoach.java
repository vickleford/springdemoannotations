package io.vickleford.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "HURRRRGH! get tougher!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Autowired
    public void setFortuneService(FortuneService fs) {
        fortuneService = fs;
    }
}
