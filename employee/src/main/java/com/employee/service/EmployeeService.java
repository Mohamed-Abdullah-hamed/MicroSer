package com.employee.service;

import com.employee.dto.EmpDeptDto;
import com.employee.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto saveEmployee(EmployeeDto employeeDto);

	EmpDeptDto getEmployeeById(Long employeeId);

}