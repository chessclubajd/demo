package com.example.demo.conrollers;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;
import com.example.demo.repos.ProjectRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


    @Controller
    public class ProjectController {

        private ProjectRepo projectRepo;

        public ProjectController(ProjectRepo projectRepo) {
            this.projectRepo = projectRepo;
        }

        @RequestMapping("/employees/{id}")
        public String displayEmployees(@PathVariable Long id, Model model){

            Optional<Project> foundProject = projectRepo.findById(id);
            model.addAttribute("singleProject", foundProject.get());
            return "singleProject.html";
        }
    }

