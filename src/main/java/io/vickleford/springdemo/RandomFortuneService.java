package io.vickleford.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] fortunes = {
            "happy random fortune",
            "sad random fortune",
            "thoughtful random fortune",
            "financial random fortune"
    };

    public RandomFortuneService() {
        fortunes = new String[]{
            "happy random fortune",
            "sad random fortune",
            "thoughtful random fortune",
            "financial random fortune"
        };
    }

    public String getFortune() {
        Random r = new Random();
        int i = r.nextInt(fortunes.length);
        return fortunes[i];
    }
}
