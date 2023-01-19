package com.cosmostaker.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmostaker.springboot.cruddemo.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
    // no need to write any code
}
