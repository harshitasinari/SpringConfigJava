package com.harshita.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportsConfig.class);

        Coach theCoach= context.getBean("tennisCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }
}
