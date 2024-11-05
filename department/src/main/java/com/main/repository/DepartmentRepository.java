package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentCode(String departmentCode);
}