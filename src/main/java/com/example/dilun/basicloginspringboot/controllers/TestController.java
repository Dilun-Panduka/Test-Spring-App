package com.example.dilun.basicloginspringboot.controllers;

import java.util.List;

import com.example.dilun.basicloginspringboot.model.User;
import com.example.dilun.basicloginspringboot.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    private final UserService userService;

    @Autowired
    public TestController(UserService userService){
        this.userService = userService;
    }

    //To get All users
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

}
