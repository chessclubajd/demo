package com.example.demo.conrollers;

import com.example.demo.models.Employee;
import com.example.demo.repos.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

public class AddressController {


    @Controller
    public class EmployeeController {

        private EmployeeRepo employeeRepo;

        public EmployeeController(EmployeeRepo employeeRepo) {
            this.employeeRepo = employeeRepo;
        }

        @RequestMapping("/employees/{id}")
        public String displayEmployees(@PathVariable Long id, Model model){

            Optional<Employee> foundEmployee = employeeRepo.findById(id);
            model.addAttribute("singleEmployee", foundEmployee.get());
            return "singleEmployee.html";
        }
    }
}
