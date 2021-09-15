package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Employee;
@Repository
public interface EmployeeRegistration extends JpaRepository<Employee, String> {

}
