package com.example.demo.repos;

import com.example.demo.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
