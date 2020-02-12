package com.spring.jpa.oracle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.oracle.entity.Employee;
import com.spring.jpa.oracle.repositry.EmployeeRepositry;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    
	@Autowired
	private EmployeeRepositry employeeRepositry;
	@Override
	public boolean saveEmployee(Employee e) {
		
		Employee emp=employeeRepositry.save(e);
		
		return (emp!=null)?true:false;
	}

}
