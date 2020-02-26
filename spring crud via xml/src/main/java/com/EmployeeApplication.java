package com;

import com.dto.Employee;
import com.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);

        Employee employee= applicationContext.getBean("employee1",Employee.class);
        employeeService.create(employee);

        Employee employee2= applicationContext.getBean("employee2",Employee.class);
        employeeService.create(employee2);

        Employee employee3= applicationContext.getBean("employee3",Employee.class);
        employeeService.create(employee3);

    }
}
