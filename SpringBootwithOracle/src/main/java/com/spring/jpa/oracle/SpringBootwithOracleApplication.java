package com.spring.jpa.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.jpa.oracle.entity.Employee;
import com.spring.jpa.oracle.service.EmployeeServiceImpl;
import com.spring.jpa.oracle.service.IEmployeeService;

@SpringBootApplication
public class SpringBootwithOracleApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBootwithOracleApplication.class, args);
		IEmployeeService service=ac.getBean(EmployeeServiceImpl.class);
		Employee emp=new Employee();
		emp.setEmpName("SantoshOracle");
		emp.setEmpSal(1000.00);
		
		boolean status=service.saveEmployee(emp);
		if(status)
			System.out.println("Data inserted");
		else
			System.out.println("Data not inserted");
	}

}
