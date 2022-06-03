package com.example.employeedepartment.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FOUND, reason = "Department already Exist")
public class DepartmentExist extends RuntimeException{

    public DepartmentExist(Long id) {
        super(String.valueOf(id));
        System.out.println("Duplication");
    }
}
