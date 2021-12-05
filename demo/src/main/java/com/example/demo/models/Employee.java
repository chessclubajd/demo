package com.example.demo.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Employee {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
     private Address employeeAddress;

    @OneToMany(mappedBy = "EmployeeProject")
    private Collection<EmployeeProject> projects;

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public Employee(String firstName, String middleName, String lastName, String suffix, Address employeeAddress, EmployeeProject...projects) {
        this.projects = List.of(projects);
        this.employeeAddress = employeeAddress;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public Employee() {
    }
}
