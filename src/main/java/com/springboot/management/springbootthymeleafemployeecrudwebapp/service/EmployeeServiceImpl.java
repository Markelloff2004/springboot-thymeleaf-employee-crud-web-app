package com.springboot.management.springbootthymeleafemployeecrudwebapp.service;

import com.springboot.management.springbootthymeleafemployeecrudwebapp.model.Employee;
import com.springboot.management.springbootthymeleafemployeecrudwebapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee searchedEmployee;
        if (optionalEmployee.isPresent()) {
            searchedEmployee = optionalEmployee.get();
        } else {
            throw new RuntimeException("Employee not found");
        }
        return searchedEmployee;
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employeeToUpdate = this.getEmployeeById(employee.getId());

        employeeToUpdate.setFirstName(employee.getFirstName());
        employeeToUpdate.setLastName(employee.getLastName());
        employeeToUpdate.setEmail(employee.getEmail());
        employeeToUpdate.setPhone(employee.getPhone());

        return employeeRepository.save(employeeToUpdate);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
