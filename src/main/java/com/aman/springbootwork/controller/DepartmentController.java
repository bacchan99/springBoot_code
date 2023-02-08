package com.aman.springbootwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.springbootwork.entity.Department;
import com.aman.springbootwork.service.DepartmentService;

@RestController
public class DepartmentController {
    @Autowired private DepartmentService departmentService;

    
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

}
