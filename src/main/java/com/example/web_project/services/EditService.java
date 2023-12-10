package com.example.web_project.services;

import com.example.web_project.entities.Account;

public interface EditService {
    Account updateUserProfile(Integer idAccount, Account updatedUser);
}
