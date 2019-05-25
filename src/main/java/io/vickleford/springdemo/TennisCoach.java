package io.vickleford.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fs) {
        fortuneService = fs;

    }

    public String getDailyWorkout() {
        System.out.println("I'm the coach for " + team +
                " and you can email questions to " + email);

        return "Practice your backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
