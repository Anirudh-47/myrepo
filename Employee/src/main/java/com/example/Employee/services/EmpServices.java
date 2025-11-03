package com.example.Employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.entity.Employee;
import com.example.Employee.repo.EmpRepo;

@Service
public class EmpServices {
	
	@Autowired
	EmpRepo er;
	
	//insert
	public Employee addEmp(Employee emp)
	{
		return er.save(emp);
	}
	//select
	public List<Employee> getEmp()
	{
		return er.findAll();
	}
	//delete
	public void delEmp(int eid)
	{
		er.deleteById(eid);
	}
}
