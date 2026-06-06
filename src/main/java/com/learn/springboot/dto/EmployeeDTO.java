package com.learn.springboot.dto;

import com.learn.springboot.model.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String name;
    private String department;

    public static EmployeeDTO from(Employee employee) {
        return new EmployeeDTO(employee.getId(),employee.getName(),employee.getDepartment());
    }

    public Employee toEntity() {
        return new Employee(id, name, department);
    }
}