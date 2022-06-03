package com.example.employeedepartment.Service;

import com.example.employeedepartment.Entity.Department;
import com.example.employeedepartment.Entity.Employee;
import com.example.employeedepartment.Model.EmployeeModel;
import com.example.employeedepartment.Repository.DepartmentRepo;
import com.example.employeedepartment.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServcieImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    DepartmentRepo departmentRepo;

    public EmployeeServcieImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public void createEmployee(EmployeeModel employeeModel) {


        Employee employee = new Employee();
        convertor(employeeModel, employee);
        employeeRepo.save(employee);
    }

    private void convertor(EmployeeModel source, Employee target) {
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
        Department department = departmentRepo.findDepartmentByDepartmentName(source.getDepartmentName());
        target.setDepartment(department);
    }
}
