package com.example.dilun.basicloginspringboot.services;

import java.util.List;

import com.example.dilun.basicloginspringboot.model.User;
import com.example.dilun.basicloginspringboot.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    
}
