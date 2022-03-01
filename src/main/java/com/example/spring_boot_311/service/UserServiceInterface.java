package com.example.spring_boot_311.service;

import com.example.spring_boot_311.model.User;

import java.util.List;

public interface UserServiceInterface {

    User findById(Long id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(Long id);


}
