package com.spring.jpa.oracle.repositry;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.oracle.entity.Employee;

@Repository
public interface EmployeeRepositry extends CrudRepository<Employee ,Serializable> {

}
