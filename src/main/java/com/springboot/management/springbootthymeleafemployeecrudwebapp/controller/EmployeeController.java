package com.springboot.management.springbootthymeleafemployeecrudwebapp.controller;

import com.springboot.management.springbootthymeleafemployeecrudwebapp.model.Employee;
import com.springboot.management.springbootthymeleafemployeecrudwebapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //show all employees
    @GetMapping("/")
    public String viewEmployee(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "listEmployees"; //  <- html filename
    }

    @GetMapping("/newEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "newEmployeeForm";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);

        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        Employee employee = employeeService.getEmployeeById(id);

        model.addAttribute("employee", employee);
        return "updateEmployeeForm";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {

        employeeService.deleteEmployee(id);

        return "redirect:/";
    }


}
