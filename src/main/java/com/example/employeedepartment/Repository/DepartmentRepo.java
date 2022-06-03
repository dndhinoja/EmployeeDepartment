package com.example.employeedepartment.Repository;

import com.example.employeedepartment.Entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Long> {

    Department findDepartmentByDepartmentName(String departmentName);
}
