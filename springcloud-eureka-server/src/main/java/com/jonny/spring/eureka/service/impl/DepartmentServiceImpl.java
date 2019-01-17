package com.jonny.spring.eureka.service.impl;

import com.jonny.spring.eureka.entity.Department;
import com.jonny.spring.eureka.repository.DepartmentRepository;
import com.jonny.spring.eureka.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.getOne(id);
    }
}
