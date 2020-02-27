package com.dao;

import com.dto.Employee;

public interface EmployeeDao {
    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);
}
