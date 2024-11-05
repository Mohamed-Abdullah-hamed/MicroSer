package com.main.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.main.dto.DepartmentDto;
import com.main.entity.Department;

@Mapper
public interface DepartmentMapper {

	DepartmentMapper INSTANCE = Mappers.getMapper( DepartmentMapper.class );
	
	Department unmap(DepartmentDto dto);
	DepartmentDto map(Department dept);
}
