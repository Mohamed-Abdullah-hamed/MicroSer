package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeprtmentDto {

	private Long id;
	private String departmentName;
	private String departmentDescription;
	private String departmentCode;
}
