package com.example.demo.repo;

import model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo  extends JpaRepository<Employee , Long> {
    Employee deleteEmployeeById(Long id);


    Optional<Employee> findEmployeeById(Long id);
}
