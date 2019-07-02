package com.yang.services;

import java.util.List;

import com.yang.domain.mysql.models.User;
import com.yang.domain.mysql.models.Employee;

public interface DemoService {
    List<Employee> findAllUser();
    void addUser(Employee user);
    
    List<User> findAllAccount();

}
