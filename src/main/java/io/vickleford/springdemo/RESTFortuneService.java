package io.vickleford.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    public String getFortune() {
        return "A fortune from the interwebs";
    }
}
