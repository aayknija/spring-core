package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");

    }
}
