package com.example.web_project.entities;

import com.example.web_project.entities.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Account")
@Table(name = "account", schema = "WebProject")
public class Account implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAccount", nullable = false)
    private Integer id;

    @Column(name = "Avatar", length = 45)
    private String avatar;

    @Column(name = "Username", length = 45)
    private String username;

    @Column(name = "Password", length = 500)
    private String password;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Type", length = 45)
    @Enumerated
    protected Role type;

    @Column(name = "PhoneNumber", length = 15)
    private String phoneNumber;

    @Column(name = "Address", length = 200)
    private String address;

    @Column(name = "Email", length = 50)
    private String email;

    @OneToMany(mappedBy = "idAccount")
    @ToString.Exclude
    private Set<Bill> bills = new LinkedHashSet<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(type.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}