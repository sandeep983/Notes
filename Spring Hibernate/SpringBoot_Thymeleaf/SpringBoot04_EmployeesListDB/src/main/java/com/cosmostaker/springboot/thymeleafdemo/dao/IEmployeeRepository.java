package com.cosmostaker.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmostaker.springboot.thymeleafdemo.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
    // no need to write any code

    /*
    If you want to sort the list by first name, you can add a method to the interface
    like this and then instead of using findAll() in the service, you can use
    findAllByOrderByFirstNameAsc()

    public List<Employee> findAllByOrderByFirstNameAsc();
    */

    // search by name
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);
}
