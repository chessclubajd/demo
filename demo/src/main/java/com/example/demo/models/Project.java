package com.example.demo.models;



import javax.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private Long id;
    private String projectName;

    @ManyToOne
    private EmployeeProject employeeProject;

    public Project(String projectName, EmployeeProject employeeProject) {

        this.projectName = projectName;
        this.employeeProject = employeeProject;
    }

    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public Project() {
    }
}
