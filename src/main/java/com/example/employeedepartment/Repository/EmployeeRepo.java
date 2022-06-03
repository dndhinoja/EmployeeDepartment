package com.example.employeedepartment.Repository;

import com.example.employeedepartment.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
