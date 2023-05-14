package com.dailycodebuffer.springbootdemo.service;


import com.dailycodebuffer.springbootdemo.entity.EmployeeEntity;
import com.dailycodebuffer.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity save(EmployeeEntity employee);
    List<EmployeeEntity> getAllEmployees();
    EmployeeEntity getEmployeeById(String id);
    void delete(EmployeeEntity employee);
}
