package com.example.demo14feb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepositiory employeeRepositiory;
	
	public ArrayList<Employee> getAllEmployees() {
		
//		ArrayList<Employee> emplist=new ArrayList<Employee>();
//		emplist.add(new Employee(101,"Salim",12333,"imgurll"));
//		emplist.add(new Employee(102,"Savita",564344,"imgurll"));
//		emplist.add(new Employee(103,"Gauravi",4343,"imgurll"));
//		emplist.add(new Employee(104,"Aarti",3243,"imgurll"));
		
		return (ArrayList<Employee>) employeeRepositiory.findAll();
		
	}

	public Employee saveEmployee(Employee employee) {
		
		return employeeRepositiory.save(employee);
	}

}
