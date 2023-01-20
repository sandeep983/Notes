package com.cosmostaker.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cosmostaker.springboot.thymeleafdemo.model.Employee;

@Controller
public class EmployeeController {
    
    // load the employee data
    private List<Employee> theEmployees;
    
    @PostConstruct
    private void loadData() {
        // create employees
        Employee e1 = new Employee(1, "Shyam", "Singh", "shyam@abc.com");
        Employee e2 = new Employee(2, "Ram", "Patel", "ram@abc.com");
        Employee e3 = new Employee(3, "Rohan", "Tiwari", "rohan@abc.com");
    
        // create the list
        theEmployees = new ArrayList<>();
        
        // add to the list
        theEmployees.add(e1);
        theEmployees.add(e2);
        theEmployees.add(e3);
    }


    // add request mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        // add to the spring model
        theModel.addAttribute("employees", theEmployees);
        
        return "listEmployees";
    }
}
