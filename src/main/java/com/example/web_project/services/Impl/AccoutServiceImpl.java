package com.example.web_project.services.Impl;

import com.example.web_project.auth.RegisterRequest;
import com.example.web_project.entities.Account;
import com.example.web_project.entities.enums.Role;
import com.example.web_project.repository.AccountRepository;
import com.example.web_project.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccoutServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Integer accountId) {
        Optional<Account> optionalAccount = accountRepository.findById(accountId);
        return optionalAccount.orElse(null);
    }

    @Override
    public Account createAccount(Account account) {
        // Add any validation or business logic before saving
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Integer accountId, Account updatedAccount) {
        // Add logic to update account
        Optional<Account> optionalAccount = accountRepository.findById(accountId);
        if (optionalAccount.isPresent()) {
            Account existingAccount = optionalAccount.get();
            // Update properties of existingAccount with those of updatedAccount
            // Save the updated account
            return accountRepository.save(existingAccount);
        } else {
            return null; // Account not found
        }
    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountRepository.deleteById(accountId);
    }

    @Override
    public Account makeAccount(RegisterRequest request) {
        return Account.builder()
                .name(request.getName())
                .username(request.getUsername())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .address(request.getAddress())
                .password(passwordEncoder.encode(request.getPassword()))
                .type(Role.USER)
                .build();
    }

    @Override
    public void saveAccount(RegisterRequest request) {
        // You can implement the save logic if needed
    }

    // You may add more methods based on your application's requirements
}
