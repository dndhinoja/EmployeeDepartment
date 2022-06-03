package com.example.employeedepartment.Service;

import com.example.employeedepartment.Entity.Department;
import com.example.employeedepartment.Exception.DepartmentExist;
import com.example.employeedepartment.Model.DepartmentModel;

public interface DepartmentService {

    public void createDepartment(DepartmentModel department) throws DepartmentExist;
}
