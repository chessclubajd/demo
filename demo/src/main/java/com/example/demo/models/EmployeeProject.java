package com.example.demo.models;

import javax.persistence.*;

@Entity
public class EmployeeProject {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private Long projectId;
    private Long employeeId;

    public Long getId() {
        return id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public EmployeeProject(Long projectId, Long employeeId) {
        this.projectId = projectId;
        this.employeeId = employeeId;
    }

    public EmployeeProject() {
    }
}
