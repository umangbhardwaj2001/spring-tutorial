package com.learn.springboot.controller;

import com.learn.springboot.dto.EmployeeDTO;
import com.learn.springboot.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeDTO> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    public ResponseEntity<String> setEmployee(@RequestBody EmployeeDTO dto) {
        return employeeService.setEmployee(dto);
    }
}