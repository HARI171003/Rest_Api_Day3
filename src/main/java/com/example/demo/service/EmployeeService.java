package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo er;
	
	public EmployeeDetails saveinfo(EmployeeDetails ed)
	{
		return er.save(ed);
	}
	 
	public List<EmployeeDetails> showinfo()
	{
		return er.findAll();
	}
	
}
