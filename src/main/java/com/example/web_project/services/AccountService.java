package com.example.web_project.services;

import com.example.web_project.auth.RegisterRequest;
import com.example.web_project.entities.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    List<Account> getAllAccounts();

    Account getAccountById(Integer accountId);

    Account createAccount(Account account);

    Account updateAccount(Integer accountId, Account updatedAccount);

    void deleteAccount(Integer accountId);

    Account makeAccount(RegisterRequest request);

    void saveAccount(RegisterRequest request);

    // You may add more service methods as needed for your application
}
