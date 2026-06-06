package com.learn.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    
}