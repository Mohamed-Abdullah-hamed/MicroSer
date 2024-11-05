package com.employee.mapper;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-05T21:44:46+0200",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto map(Employee emp) {
        if ( emp == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setDepartmentCode( emp.getDepartmentCode() );
        employeeDto.setEmail( emp.getEmail() );
        employeeDto.setFirstName( emp.getFirstName() );
        employeeDto.setId( emp.getId() );
        employeeDto.setLastName( emp.getLastName() );
        employeeDto.setOrganizationCode( emp.getOrganizationCode() );

        return employeeDto;
    }

    @Override
    public Employee unmap(EmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setDepartmentCode( dto.getDepartmentCode() );
        employee.setEmail( dto.getEmail() );
        employee.setFirstName( dto.getFirstName() );
        employee.setId( dto.getId() );
        employee.setLastName( dto.getLastName() );
        employee.setOrganizationCode( dto.getOrganizationCode() );

        return employee;
    }
}
