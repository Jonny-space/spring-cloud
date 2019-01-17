package com.jonny.spring.eureka.service;

import com.jonny.spring.eureka.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long id);

}
