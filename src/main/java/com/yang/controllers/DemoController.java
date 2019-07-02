package com.yang.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yang.domain.mysql.models.User;
import com.yang.domain.mysql.models.Employee;
import com.yang.services.DemoService;

@RestController
public class DemoController {
    
    @Autowired
    private DemoService demoService;
    
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public ResponseEntity<List<Employee>> demo(){
        return new ResponseEntity<List<Employee>>(demoService.findAllUser(), HttpStatus.OK);
    }
    @RequestMapping(value="/user/add", method=RequestMethod.POST)
    public ResponseEntity<Void> save(@RequestParam(value="name") String name){
        Employee user = new Employee();
        user.setName(name);
        demoService.addUser(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @RequestMapping(value="/accounts", method=RequestMethod.GET)
    public ResponseEntity<List<User>> getAccount(){
        return new ResponseEntity<>(demoService.findAllAccount(),HttpStatus.OK);
    }

}
