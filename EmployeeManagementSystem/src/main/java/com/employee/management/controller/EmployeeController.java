package com.employee.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.model.Employee;
import com.employee.management.serviceIMPL.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl empservice;

	@GetMapping("/home")
	public String Homapage() {
		return "Welcome to Employee Management System";
	}
	
	@PostMapping("/addEmp")
	public ResponseEntity<Employee> addEmployee (@RequestBody Employee employee) {
		
		Employee emp = empservice.addEmployee(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<String> removeEmolyee(@PathVariable int id) {
		empservice.removeEmployee(id);
		
		return new ResponseEntity<String>("Remove Successfully", HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/findEmp/{id}")
	public  ResponseEntity<Optional<Employee>> findEmployeeById(@PathVariable int id) {
		
		Optional<Employee> emps = empservice.findEmpById(id);
		
		return new ResponseEntity<Optional<Employee>> (emps,  HttpStatus.ACCEPTED);
			
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		
	  List<Employee> lemp = empservice.getAllEmployee();
	  return new  ResponseEntity<List<Employee>> (lemp,HttpStatus.ACCEPTED);
	   
	}
	
	@PostMapping("/update")
	public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee) {
		Employee emp = empservice.updateEmployee(employee);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
	}
	@PutMapping("/update2/{id}")
	public ResponseEntity<Employee> updateEmployeeById2(@RequestBody Employee employee,@PathVariable int id) {
		Employee emp = empservice.updateEmployee2(employee, id);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
	}
}
