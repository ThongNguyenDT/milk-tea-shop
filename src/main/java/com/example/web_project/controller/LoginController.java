package com.example.web_project.controller;
import com.example.web_project.services.LoginService;
import com.example.web_project.entities.LoginCredential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    @PostMapping
    public ResponseEntity<Object> login(@RequestBody LoginRequest loginRequest) {
        // Check login information
        LoginCredential user = loginService.loginUser(loginRequest.getUserName(), loginRequest.getPassword());

        if (user != null) {
            // Successful login, return user information
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            // Login failed
            return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }
}
