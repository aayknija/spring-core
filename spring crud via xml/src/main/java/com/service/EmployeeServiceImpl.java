package com.service;

import com.dao.EmployeeDao;
import com.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Employee create(Employee employee) {
        return employeeDao.create(employee);
    }

    public Employee update(Employee employee) {
        return employeeDao.update(employee);
    }

    public void delete(Employee employee) {
        employeeDao.delete(employee);
    }
}
