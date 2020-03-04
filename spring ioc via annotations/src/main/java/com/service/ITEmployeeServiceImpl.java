package com.service;

import com.dao.EmployeeDao;
import com.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ITEmployeeService")
public class ITEmployeeServiceImpl implements EmployeeService {

    @Autowired
    @Qualifier
    private EmployeeDao employeeDao;

    public ITEmployeeServiceImpl(EmployeeDao employeeDao) {
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
