package com.cosmostaker.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    // To list all employees on home page
    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        // get employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);
        
        return "employees/listEmployees";
    }




    // add mapping for "addForm"
    // To show the add form and add new employee
    @GetMapping("/addForm")
    public String addForm(Model theModel) {

        // create model attribute to bind form data
        Employee theEmployee = new Employee();

        theModel.addAttribute("employee", theEmployee);

        return "employees/addForm";
    }

    // add mapping for "save"
    // Save button - process the form and save the employee
    @PostMapping("/save")
    public String saveEmployee(Employee theEmployee) {

        // save the employee
        employeeService.save(theEmployee);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }




    // add mapping for "update"
    // To show the addForm and update the employee
    @GetMapping("/update")
    public String updateEmployee(@RequestParam("employeeId") int theId, Model theModel) {

        // get the employee from the service
        Employee theEmployee = employeeService.findById(theId);

        // set employee as a model attribute to pre-populate the form
        theModel.addAttribute("employee", theEmployee);

        // send over to our form
        return "employees/addForm";
    }




    // add mapping for "delete"
    // To delete the employee
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId) {

        // delete the employee
        employeeService.deleteById(theId);

        // redirect to /employees/list
        return "redirect:/employees/list";
    }


    

    // add mapping for "search"
    // To search the employee
    @GetMapping("/search")
	public String delete(@RequestParam("employeeName") String theName,
						 Model theModel) {
		
		// search employee
		List<Employee> theEmployees = employeeService.searchBy(theName);
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		// send to /employees/list
		return "/employees/listEmployees";
	}
}
