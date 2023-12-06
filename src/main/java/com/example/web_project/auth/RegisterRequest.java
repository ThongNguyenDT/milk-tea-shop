package com.example.web_project.auth;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @Size(min = 2, message = "name has at least 2 characters")
    private String name;
    @Size(min = 2, max = 45, message = "username has at least 2 characters")
    private String username;
    @Size(min = 8, message = "password has at least 8 characters")
    private String password;
    @Size(min = 2, message = "email has at least 2 characters")
    private String email;
    @Size(min = 8, message = "phone has at least 8 characters")
    private String phoneNumber;
    @Size(min = 2, message = "address has at least 2 characters")
    private String address;
}