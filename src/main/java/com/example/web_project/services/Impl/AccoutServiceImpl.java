package com.example.web_project.services.Impl;

import com.example.web_project.auth.RegisterRequest;
import com.example.web_project.entities.Account;
import com.example.web_project.entities.enums.Role;
import com.example.web_project.repository.AccountRepository;
import com.example.web_project.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccoutServiceImpl implements AccountService {
    private final PasswordEncoder passwordEncoder;


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

    }
}
