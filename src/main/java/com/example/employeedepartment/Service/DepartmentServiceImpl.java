package com.example.employeedepartment.Service;

import com.example.employeedepartment.Entity.Department;
import com.example.employeedepartment.Exception.DepartmentExist;
import com.example.employeedepartment.Model.DepartmentModel;
import com.example.employeedepartment.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepo departmentRepo;

    public DepartmentServiceImpl(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @Override
    public void createDepartment(@RequestParam DepartmentModel departmentModel) throws DepartmentExist {

        checkIfDepartmentExist(departmentModel);
        Department department = new Department();
        convertor(departmentModel, department);
        departmentRepo.save(department);

    }

    private void checkIfDepartmentExist(DepartmentModel departmentModel) throws DepartmentExist {
        Department departmentExistence = departmentRepo.findDepartmentByDepartmentName(departmentModel.getDepartmentName());
        if(departmentExistence!=null){
            throw new DepartmentExist(departmentExistence.getDepartmentId());
        }
    }

    public void convertor(DepartmentModel source, Department target){
        target.setDepartmentName(source.getDepartmentName());
    }

}
