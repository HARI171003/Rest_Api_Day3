package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeControl {

	@Autowired
	EmployeeService es;
	
	@PostMapping("addEmployee")
	public EmployeeDetails add( @RequestBody EmployeeDetails ed)
	{
		return es.saveinfo(ed);
	}
	@GetMapping("showEmployee")
	public List<EmployeeDetails> show()
	{
		return es.showinfo();
	}
}
