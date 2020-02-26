package com.dao;

import com.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

   // TODO : Database to be configured

    public Employee create(Employee employee) {
        System.out.println("Employee created successfully");
        return null;
    }

    public Employee update(Employee employee) {
        System.out.println("Employee updated successfully");
        return null;
    }

    public void delete(Employee employee) {
        System.out.println("Employee deleted successfully");
    }
}
