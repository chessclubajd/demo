package com.example.demo.conrollers;

import com.example.demo.models.EmployeeProject;
import com.example.demo.repos.EmployeeProjectRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

    @Controller
    public class EmployeeProjectController {

        private EmployeeProjectRepo employeeProjectRepo;

        public EmployeeProjectController(EmployeeProjectRepo employeeRepo) {
            this.employeeProjectRepo = employeeProjectRepo;
        }

        @RequestMapping("/employeeProject/{id}")
        public String displayEmployees(@PathVariable Long id, Model model){

            Optional<EmployeeProject> foundEmployeeProject = employeeProjectRepo.findById(id);
            model.addAttribute("singleEmployeeProject", foundEmployeeProject.get());
            return "singleEmployeeProject.html";
        }
    }
}
