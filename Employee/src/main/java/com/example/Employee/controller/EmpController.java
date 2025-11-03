package com.example.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Employee.entity.Employee;
import com.example.Employee.services.EmpServices;
@Controller
public class EmpController {

	@Autowired
	EmpServices es;
	
	@PostMapping("/addemp")
	public Employee addEmployee(Employee emp)
	{
		return es.addEmp(emp);
	}
	@GetMapping("/retrivaldata")
	public List<Employee> getEmployee()
	{
		return es.getEmp();
	}
	@DeleteMapping("/deletingrecord")
	public void deleteEmp(@PathVariable int eid)
	{
		es.delEmp(eid);
	}
}
