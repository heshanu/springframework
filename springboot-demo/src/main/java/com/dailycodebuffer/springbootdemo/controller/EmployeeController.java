package com.dailycodebuffer.springbootdemo.controller;

import com.dailycodebuffer.springbootdemo.entity.EmployeeEntity;
import com.dailycodebuffer.springbootdemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

@Autowired
private EmployeeServiceImpl employeeService;

    @PostMapping("/")
    public EmployeeEntity save(@RequestBody EmployeeEntity employee){
        return employeeService.save(employee);
    }

    @GetMapping("/")
    public List<EmployeeEntity> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable String id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable EmployeeEntity id){
        employeeService.delete(id);
    }

/*
    @PostMapping("/")
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return employeeService.getAllEmployeeById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable String id){
        employeeService.deleteEmployeeById(id);
    }*/
}
