package com.company.employeemanagement.repository;

import com.company.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment(String department);
    Optional<Employee> findByEmail(String email);
}