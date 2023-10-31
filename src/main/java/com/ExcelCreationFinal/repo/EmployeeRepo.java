package com.ExcelCreationFinal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExcelCreationFinal.Employee.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Serializable>{
}
