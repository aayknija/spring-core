package com;

import com.dto.Employee;
import com.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCViaAnnotationsApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");

        Employee employee1= new Employee();
        employee1.setId("E001");
        employee1.setName("Ajinkya");
        employee1.setDepartment("IT");
        employee1.setDesignation("SSE");
        employee1.setEmployeeCode("EC001");

        EmployeeService employeeService = applicationContext.getBean("ITEmployeeService", EmployeeService.class);
        employee1 = employeeService.create(employee1);
        System.out.println("Closing application context");
        applicationContext.close();
        System.out.println("Application context closed successfully !");

    }
}
