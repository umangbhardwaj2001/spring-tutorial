package com.learn.springboot.service;

import com.learn.springboot.dto.EmployeeDTO;
import com.learn.springboot.model.Employee;
import com.learn.springboot.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll().stream().map(EmployeeDTO::from).toList();
    }

    public ResponseEntity<String> setEmployee(EmployeeDTO dto) {
        Employee employee = employeeRepository.save(dto.toEntity());
        if(employee == null) {
            return ResponseEntity.status(500).body("Failed to save employee");
        }

          System.out.println("Name: " + dto.getName());
          System.out.println("Department: " + dto.getDepartment());

        return ResponseEntity.ok("Employee saved successfully");
    }
}