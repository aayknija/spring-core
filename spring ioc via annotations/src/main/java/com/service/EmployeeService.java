package com.service;

import com.dto.Employee;

public interface EmployeeService {

    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);
}
