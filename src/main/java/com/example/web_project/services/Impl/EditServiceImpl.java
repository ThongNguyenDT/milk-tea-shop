package com.example.web_project.services.Impl;

import com.example.web_project.entities.Account;
import com.example.web_project.services.AccountService;
import com.example.web_project.services.EditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditServiceImpl implements EditService {

    private final AccountService accountService;

    @Autowired
    public EditServiceImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public Account updateUserProfile(Integer idAccount, Account updatedUser) {

        return accountService.updateAccount(idAccount, updatedUser);
    }
}
