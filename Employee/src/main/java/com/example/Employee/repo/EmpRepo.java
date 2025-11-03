package com.example.Employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.entity.Employee;

//Marker interface
public interface EmpRepo extends JpaRepository<Employee,Integer>{

}