package com.example.demo.repos;

import com.example.demo.models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends CrudRepository<Project, Long> {
}
