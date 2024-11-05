package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Company;

public interface CompanyRepo extends JpaRepository<Company,Integer>{

}
