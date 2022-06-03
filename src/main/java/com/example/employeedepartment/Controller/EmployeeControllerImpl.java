package com.example.employeedepartment.Controller;

import com.example.employeedepartment.Entity.Employee;
import com.example.employeedepartment.Model.EmployeeModel;
import com.example.employeedepartment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeControllerImpl implements EmployeeController{

    @Autowired
    EmployeeService employeeService;

    public EmployeeControllerImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    @PostMapping("/newemployee")
    public void createEmployee(@RequestBody EmployeeModel employee) {
        System.out.println("Employee created");
        employeeService.createEmployee(employee);
    }
}
