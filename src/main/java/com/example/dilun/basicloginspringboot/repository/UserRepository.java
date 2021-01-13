package com.example.dilun.basicloginspringboot.repository;

import com.example.dilun.basicloginspringboot.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
