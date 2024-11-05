package com.employee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.DeprtmentDto;
import com.employee.dto.EmpDeptDto;
import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.mapper.EmployeeMapper;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	private EmployeeMapper mapper = EmployeeMapper.instance;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

		Employee employee = mapper.unmap(employeeDto);

		Employee saveDEmployee = employeeRepository.save(employee);

		EmployeeDto savedEmployeeDto = mapper.map(saveDEmployee);

		return savedEmployeeDto;
	}

	@Override
	public EmpDeptDto getEmployeeById(Long employeeId) {
		Employee employee = null;
		try {
			employee = employeeRepository.findById(employeeId).get();
		} catch (Exception e) {
			e.printStackTrace();
			// throw new ResourceNotFoundException(e.getMessage());
		}

		EmployeeDto empDto = mapper.map(employee);
		// DeprtmentDto dept = getDeptDto(empDto.getDepartmentCode());
		EmpDeptDto empDept = new EmpDeptDto(empDto, new DeprtmentDto());
		return empDept;
	}

	public EmpDeptDto getDefaultDept(Long employeeId, Throwable th) {
		Employee employee = null;
		try {
			employee = employeeRepository.findById(employeeId).get();
		} catch (Exception e) {
			e.printStackTrace();
			// throw new ResourceNotFoundException(e.getMessage());
		}

		EmployeeDto empDto = mapper.map(employee);
		DeprtmentDto dept = new DeprtmentDto(null, "HR", null, "00000");
		EmpDeptDto empDept = new EmpDeptDto(empDto, dept);
		return empDept;
	}
	/*
	 * private DeprtmentDto getDeptDto(String deptCode) { // String uri =
	 * "http://localhost:8080/api/departments/"+deptCode; // DeprtmentDto dept = //
	 * webClient.get().uri(uri).retrieve().bodyToMono(DeprtmentDto.class).block();
	 * DeprtmentDto dept = client.getDept(deptCode); return dept; }
	 */

}