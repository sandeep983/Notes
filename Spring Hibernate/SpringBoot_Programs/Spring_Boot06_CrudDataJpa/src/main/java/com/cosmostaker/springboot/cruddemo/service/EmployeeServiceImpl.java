package com.cosmostaker.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosmostaker.springboot.cruddemo.dao.IEmployeeRepository;
import com.cosmostaker.springboot.cruddemo.entity.Employee;

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
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        
        Employee theEmployee = null;
        
        if(result.isPresent()) {
        	theEmployee = result.get();
        }
        else {
        	throw new RuntimeException("Did not fint the employee id: " + theId);
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
}
