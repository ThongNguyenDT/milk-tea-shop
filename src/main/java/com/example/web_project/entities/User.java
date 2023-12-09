package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "User")
@Table(name = "user", schema = "WebProject")
public class User {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAccount", nullable = false)
    private Integer idAccount;

    @Getter
    @Column(name = "Username", length = 45)
    private String username;

    @Column(name = "Name", length = 45)
    private String name;

    @Getter
    @Column(name = "Email", length = 45)
    private String email;

    @Getter
    @Column(name = "Password", length = 45)
    private String password;

    @Getter
    @Column(name = "PhoneNumber", length = 45)
    private String phoneNumber;

    @Getter
    @Column(name = "Address", length = 45)
    private String address;


}
