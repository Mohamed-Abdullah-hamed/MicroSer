package com.employee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;

@Mapper
public interface EmployeeMapper {

	EmployeeMapper instance = Mappers.getMapper(EmployeeMapper.class);
	
	EmployeeDto map(Employee emp);
	Employee unmap(EmployeeDto dto);
}
