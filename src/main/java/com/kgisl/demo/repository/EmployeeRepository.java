package com.kgisl.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.demo.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}