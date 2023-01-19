package com.cosmostaker.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmostaker.springboot.cruddemo.entity.Employee;

// If we want to change the exposed path we can use below annotation 
// @RepositoryRestResource(path="members")
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
    // no need to write any code
}
