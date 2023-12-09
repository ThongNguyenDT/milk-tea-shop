package com.example.web_project.services;

import com.example.web_project.entities.User;

public interface EditService {
    User updateUserProfile(Integer id, User updatedUser);
}
