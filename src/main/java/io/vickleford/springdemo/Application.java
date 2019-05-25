package io.vickleford.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = c.getBean("rugbyCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        c.close();
    }
}
