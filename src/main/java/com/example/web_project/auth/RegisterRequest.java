package com.example.web_project.auth;


import com.example.web_project.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String name;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;

    private Role role;
}