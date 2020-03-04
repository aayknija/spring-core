package com.service;

import com.dao.EmployeeDao;
import com.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("defaultEmployeeService")
public class DefaultEmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public DefaultEmployeeServiceImpl(EmployeeDao employeeDao) {
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
