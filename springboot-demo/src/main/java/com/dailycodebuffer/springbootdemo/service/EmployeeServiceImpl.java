package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.entity.EmployeeEntity;
import com.dailycodebuffer.springbootdemo.error.EmployeeNotFoundException;
import com.dailycodebuffer.springbootdemo.model.Employee;
import com.dailycodebuffer.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity save(EmployeeEntity employee) {
        if(employee.getEmployeeId()==null || employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        EmployeeEntity entity=new EmployeeEntity();
        BeanUtils.copyProperties(employee,entity);
         employeeRepository.save(entity);
         return employee;
    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        List<EmployeeEntity> employeeList=employeeRepository.findAll();

        List<EmployeeEntity> employees=employeeList.stream()
                .map(employeeEntity->{
                    EmployeeEntity employee=new EmployeeEntity();
                    BeanUtils.copyProperties(employeeEntity,employee);
                    return employee;
                })
                .collect(Collectors.toList());

        return employees;

    }

    @Override
    public EmployeeEntity getEmployeeById(String id) {
        EmployeeEntity employeeEntity=employeeRepository.findById(id).get();
        EmployeeEntity employee=new EmployeeEntity();
        BeanUtils.copyProperties(employeeEntity,employee);

        return employee;
    }

    @Override
    public void delete(EmployeeEntity employeeId) {
        employeeRepository.delete(employeeId);
        System.out.println("delete succefully");
    }
}
