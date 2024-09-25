package com.employee.management.service;

import java.util.List;
import java.util.Optional;

import com.employee.management.model.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	public String removeEmployee(int id);
	
	public Optional<Employee> findEmpById(int id);
	
	public List<Employee> getAllEmployee();
	
	public Employee updateEmployee( Employee employee);
	
	public Employee updateEmployee2( Employee employee , int id);
		
	

}
