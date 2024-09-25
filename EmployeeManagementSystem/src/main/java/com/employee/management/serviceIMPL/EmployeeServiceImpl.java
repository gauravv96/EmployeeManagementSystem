package com.employee.management.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRepo;
import com.employee.management.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired 
	public EmployeeRepo employeerepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		Employee emp = employeerepo.save(employee);
		
		return emp;
	}

	@Override
	public String removeEmployee(int id) {
		
	 	employeerepo.deleteById(id);
		return "Delete Data Successfully";
	}

	@Override
	public Optional<Employee> findEmpById(int id) {
	 
		Optional <Employee> emp = employeerepo.findById(id);
		
		if(emp.isPresent()) {
			return emp;
		} else {
			return null;
		}
	}


	@Override
	public List<Employee> getAllEmployee() {
		
	List<Employee>	empList = employeerepo.findAll();
		return empList;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	  
		Optional<Employee> emp = employeerepo.findById(employee.getId());
		if(emp.isPresent()) {
			employeerepo.save(employee);
			return employee;
		}else {
		
		 return null ;
			
			
		}
	}
		
		@Override
		public Employee updateEmployee2(Employee employee , int id) {
		  
			Optional<Employee> emp = employeerepo.findById(id);
			employee.setId(id);
			if(emp.isPresent()) {
				employeerepo.save(employee);
				return employee;
			}else {
			
			 return null ;
				
				
			}
		
	
		
		
	}
	}

	


