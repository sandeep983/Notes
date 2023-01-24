package com.cosmostaker.springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosmostaker.springboot.thymeleafdemo.dao.IEmployeeRepository;
import com.cosmostaker.springboot.thymeleafdemo.entity.Employee;



@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(IEmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
        // we can call that sort method like this
        // return employeeRepository.findAllByOrderByFirstNameAsc();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        
        Employee theEmployee = null;
        
        if(result.isPresent()) {
        	theEmployee = result.get();
        }
        else {
        	throw new RuntimeException("Did not find the employee with id: " + theId);
        }
        
		return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);        
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }    

    @Override
	public List<Employee> searchBy(String theName) {
		
		List<Employee> results = null;
		
		if (theName != null && (theName.trim().length() > 0)) {
			results = employeeRepository.findByFirstNameContainsOrLastNameContainsAllIgnoreCase(theName, theName);
		}
		else {
			results = findAll();
		}
		
		return results;
	}
}
