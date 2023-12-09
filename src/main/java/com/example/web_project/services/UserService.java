package com.example.web_project.services;

import com.example.web_project.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserProfile(Integer id);

    // Additional methods as needed
}
