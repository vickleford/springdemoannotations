package io.vickleford.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "today is your lunchy day";
    }
}
