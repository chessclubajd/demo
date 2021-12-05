package com.example.demo.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue

    private Long id;
    private String projectName;
    private

    public Project(String projectName) {

        this.projectName = projectName;
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
