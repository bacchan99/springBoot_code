package com.aman.springbootwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.springbootwork.entity.Department;
import com.aman.springbootwork.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	
	@Autowired
    private DepartmentRepository departmentRepository;

	@Override
	public List<Department> fetchDepartmentList() {
		return (List<Department>)
	            departmentRepository.findAll();
	}

}
