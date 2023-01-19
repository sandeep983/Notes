package com.cosmostaker.springboot.cruddemo.dao;

import java.util.List;

import com.cosmostaker.springboot.cruddemo.entity.Employee;

public interface IEmployeeDAO {
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);
}
