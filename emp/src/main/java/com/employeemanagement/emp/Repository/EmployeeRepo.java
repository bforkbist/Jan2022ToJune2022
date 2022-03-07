package com.employeemanagement.emp.Repository;

import com.employeemanagement.emp.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {


    Optional<Employee> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
