package com.example.web_project.models;
import lombok.*;

@Getter
public class UserProfile {
    private final String userName;
    private final String fullName;
    private final String email;

    private final String phone;

    private final String mobile;

    private final String address;


    public UserProfile(String userName, String fullName, String email, String phone, String mobile, String address) {
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.address = address;
    }


}
