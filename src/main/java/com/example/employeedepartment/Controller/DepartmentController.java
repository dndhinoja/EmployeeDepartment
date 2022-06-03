package com.example.employeedepartment.Controller;

import com.example.employeedepartment.Entity.Department;
import com.example.employeedepartment.Exception.DepartmentExist;
import com.example.employeedepartment.Model.DepartmentModel;

public interface DepartmentController {
    public void createDepartment(DepartmentModel department) throws DepartmentExist;
}
