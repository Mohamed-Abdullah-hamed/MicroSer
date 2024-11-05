package com.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
//import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.main.dto.DepartmentDto;
import com.main.entity.Department;
import com.main.errorHandler.ResourceNotFoundException;
import com.main.mapper.DepartmentMapper;
import com.main.repository.DepartmentRepository;
import com.main.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	private DepartmentMapper mapper = DepartmentMapper.INSTANCE;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {


		Department department = mapper.unmap(departmentDto);
		Department savedDepartment = departmentRepository.save(department);
		DepartmentDto savedDepartmentDto = mapper.map(savedDepartment);
		return savedDepartmentDto;
	}

	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode) {
		Department department = null;
		
			department = departmentRepository.findByDepartmentCode(departmentCode);
			if(department == null)
			throw new ResourceNotFoundException("No value present");
		
   //	convert department to department dto using Map Struct
		DepartmentDto departmentDto = mapper.map(department);
		return departmentDto;
	}
}