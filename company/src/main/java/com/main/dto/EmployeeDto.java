package com.main.dto;



public class EmployeeDto {

	private long id;
	private String name;
	private String birthDate;
	private String joiningDate;
	private double salary;
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDto(String name, String birthDate, String joiningDate, double salary) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.joiningDate = joiningDate;
		this.salary = salary;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

	
}
