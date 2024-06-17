package com.springboot.management.springbootthymeleafemployeecrudwebapp.service;

import com.springboot.management.springbootthymeleafemployeecrudwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);

    void saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(long id);
}
