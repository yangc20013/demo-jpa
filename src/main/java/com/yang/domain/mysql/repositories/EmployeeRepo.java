package com.yang.domain.mysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yang.domain.mysql.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
