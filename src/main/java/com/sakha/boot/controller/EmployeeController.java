package com.sakha.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakha.boot.model.Employee;
import com.sakha.boot.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;


	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee emp,Model m)
	{
		Employee saveemp = empService.saveEmployee(emp);
		m.addAttribute("emp",saveemp);
		return "view";
	}
	

	@PostMapping("/getoneemployee")
	public String getOneEmployee(@RequestParam("empId") int id,Model m)
	{
		Employee getOneEmp=empService.getOneEmployee(id);
		m.addAttribute("emp" , getOneEmp);
		return "view";
	}
	
	

	@PostMapping("/getoneemployeebyname")
	public String getOneEmployee(@RequestParam("empName") String name,Model m)
	{
		Employee getOneEmpByName=empService.getOneEmployeeByName(name);
		m.addAttribute("emp" , getOneEmpByName);
		return "view";
	}
	

	@PostMapping("/getallemployee")
	public String getAllEmployee(Model m)
	{
		List<Employee> empList = empService.getAllEmployee();
		m.addAttribute("emp",empList);
		return "view";
	}
	

	@PostMapping("/deleteemployee")
	public String delete(@RequestParam("empId") int id,Model m)
	{
		empService.deleteEmployee(id);
		m.addAttribute("emp","Sucessful");
		return "view";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Employee emp,@RequestParam("empId") int id,@RequestParam("empName") String empname,@RequestParam("age") int age,Model m)
	{
		emp.setAge(age);
		emp.setEmpId(id);
		emp.setEmpName(empname);
		empService.UpdateEmployee(emp);
		m.addAttribute("emp","update sucessful");
		return "view";
	}
	
	
}
