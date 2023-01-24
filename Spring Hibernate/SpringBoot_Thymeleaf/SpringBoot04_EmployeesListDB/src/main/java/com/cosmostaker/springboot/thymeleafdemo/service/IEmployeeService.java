package com.cosmostaker.springboot.thymeleafdemo.service;

import java.util.List;

import com.cosmostaker.springboot.thymeleafdemo.entity.Employee;


public interface IEmployeeService {
    public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchBy(String theName);
}
