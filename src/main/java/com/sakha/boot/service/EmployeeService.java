package com.sakha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.boot.model.Employee;
import com.sakha.boot.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	public Employee saveEmployee(Employee emp)
	{
		return repo.save(emp);
	}
	
	public Employee getOneEmployee(int empId)
	{
		return repo.getOne(empId);
	}
	
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}
	
	public void deleteEmployee(int empId)
	{
		repo.deleteById(empId);
	}
	
	public Employee getOneEmployeeByName(String name)
	{
		return repo.findByName(name);
	}

	public void UpdateEmployee(Employee emp) {
		
		Employee emp2 = new Employee();
		emp2.setEmpId(emp.getEmpId());
		emp2.setAge(emp.getAge());
		emp2.setEmpName(emp.getEmpName());
		repo.save(emp2);
		
	}
}
