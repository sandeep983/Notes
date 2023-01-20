package com.cosmostaker.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cosmostaker.springboot.thymeleafdemo.entity.Employee;
import com.cosmostaker.springboot.thymeleafdemo.service.IEmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private IEmployeeService employeeService;
    
    @Autowired
    public EmployeeController(IEmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }


    // add mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        // get employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);
        
        return "employees/listEmployees";
    }


    // add mapping for "addForm"
    @GetMapping("/addForm")
    public String addForm(Model theModel) {

        // create model attribute to bind form data
        Employee theEmployee = new Employee();

        theModel.addAttribute("employee", theEmployee);

        return "employees/addForm";
    }


    // add mapping for "save"
    @PostMapping("/save")
    public String saveEmployee(Employee theEmployee) {

        // save the employee
        employeeService.save(theEmployee);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }
}
