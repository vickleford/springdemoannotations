package io.vickleford.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    public String getFortune() {
        return "a fortune from the database";
    }
}
