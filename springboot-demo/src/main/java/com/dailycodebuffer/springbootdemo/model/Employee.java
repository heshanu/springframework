package com.dailycodebuffer.springbootdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    @JsonIgnore
    private String emailId;
    @JsonIgnore
    private String department;

}
