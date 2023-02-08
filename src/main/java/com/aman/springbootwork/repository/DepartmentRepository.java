package com.aman.springbootwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.springbootwork.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
