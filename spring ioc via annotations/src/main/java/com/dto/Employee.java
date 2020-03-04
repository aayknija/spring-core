package com.dto;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;

@Data
public class Employee implements DisposableBean {

    public Employee(){
    }
    public Employee(String id, String name, String employeeCode, String designation, String department) {
        this.id = id;
        this.name = name;
        this.employeeCode = employeeCode;
        this.designation = designation;
        this.department = department;
    }

    private String id;
    private String name;
    private String employeeCode;
    private String designation;
    private String department;

    public void init(){
        System.out.println("Employee object initializing : "+this);
    }

    @Override
    public void destroy(){
        System.out.println("In Employee destroy : "+this);
    }

}
