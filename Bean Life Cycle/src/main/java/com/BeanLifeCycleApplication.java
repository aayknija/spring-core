package com;

import com.dto.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");

        Employee employee1 = applicationContext.getBean("employee1", Employee.class);
        System.out.println("Employee 1 :"+employee1);

        Employee employee2 = applicationContext.getBean("employee2", Employee.class);
        System.out.println("Employee 2 :"+employee2);

        System.out.println("Closing application context");
        applicationContext.close();
        System.out.println("Application context closed successfully !");

    }
}
