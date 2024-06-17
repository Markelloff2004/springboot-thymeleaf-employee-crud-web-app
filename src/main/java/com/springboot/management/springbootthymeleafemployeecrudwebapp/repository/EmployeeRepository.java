package com.springboot.management.springbootthymeleafemployeecrudwebapp.repository;

import com.springboot.management.springbootthymeleafemployeecrudwebapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
