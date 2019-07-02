package com.yang.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.domain.mysql.models.User;
import com.yang.domain.mysql.models.Employee;
import com.yang.domain.mysql.repositories.UserRepo;
import com.yang.domain.mysql.repositories.EmployeeRepo;
import com.yang.services.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<Employee> findAllUser() {
        return employeeRepo.findAll();
    }

    @Override
    public void addUser(Employee user) {
        employeeRepo.save(user);
    }

    @Override
    public List<User> findAllAccount() {
        return userRepo.findAll();
    }

}
