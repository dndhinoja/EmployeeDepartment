package com.example.employeedepartment.Controller;

import com.example.employeedepartment.Entity.Department;
import com.example.employeedepartment.Exception.DepartmentExist;
import com.example.employeedepartment.Model.DepartmentModel;
import com.example.employeedepartment.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentControllerImpl implements DepartmentController{

    @Autowired
    DepartmentService departmentService;

    public DepartmentControllerImpl(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    @PostMapping("/newdepartment")
    public void createDepartment(@RequestBody DepartmentModel department) throws DepartmentExist {
        departmentService.createDepartment(department);
        System.out.println("Department created");
    }

    //for demo
    @GetMapping("/hi")
    public String hi(){
        System.out.println("hi");
        return "hi";
    }
}
