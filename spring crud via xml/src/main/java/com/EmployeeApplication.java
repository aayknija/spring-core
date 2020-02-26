package com;

import com.dto.Employee;
import com.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
        Employee employee= applicationContext.getBean("employee1",Employee.class);
        // Create Employee
        employeeService.create(employee);

    }
}
