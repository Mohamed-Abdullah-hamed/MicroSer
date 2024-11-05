package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmpDeptDto;
import com.employee.dto.EmployeeDto;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
//	@Value("${spring.msg}")
//	private String msg;
	
	// Build Save Employee REST API
	@PostMapping
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
		EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/msg")
	public String getMsg() {
		return "Hello";
	}
	
	// Build Get Employee REST API
	@GetMapping("{id}")
	public ResponseEntity<EmpDeptDto> getEmployee(@PathVariable("id") Long employeeId) {
		EmpDeptDto empDto = employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<>(empDto, HttpStatus.OK);
	}
}