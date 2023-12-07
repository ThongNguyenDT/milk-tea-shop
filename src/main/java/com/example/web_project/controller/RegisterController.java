package com.example.web_project.controller;

import com.example.web_project.entities.User;
import com.example.web_project.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/register")
public class RegisterController {

    private final RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user, @RequestParam("confirmPassword") String confirmPassword) {

        User registeredUser = registerService.registerUser(user, confirmPassword);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
}
