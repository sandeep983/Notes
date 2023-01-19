package com.cosmostaker.springboot.cruddemo.service;

import java.util.List;

import com.cosmostaker.springboot.cruddemo.entity.Employee;

public interface IEmployeeService {
    public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);
}