package com.main.mapper;

import com.main.dto.DepartmentDto;
import com.main.entity.Department;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-05T22:21:30+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public Department unmap(DepartmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Department department = new Department();

        return department;
    }

    @Override
    public DepartmentDto map(Department dept) {
        if ( dept == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        return departmentDto;
    }
}
