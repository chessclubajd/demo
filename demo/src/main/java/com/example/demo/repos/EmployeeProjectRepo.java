package com.example.demo.repos;

import com.example.demo.models.EmployeeProject;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeProjectRepo extends CrudRepository<EmployeeProject, Long> {
}
