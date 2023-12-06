package com.example.web_project.services;

import com.example.web_project.auth.RegisterRequest;
import com.example.web_project.entities.Account;
import com.example.web_project.repository.AccountRepository;

public interface AccountService {
    public Account makeAccount(RegisterRequest request);
    public void saveAccount(RegisterRequest request);
}
