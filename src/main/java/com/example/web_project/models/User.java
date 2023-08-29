package com.example.web_project.models;

import com.example.web_project.entities.Account;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter
public class User extends Account implements UserDetails {
//    @Builder
//    public User(Integer id, String avatar, String username, String password, String name, Role type, String phoneNumber, String address, String email, Set<Bill> bills) {
//        super(id, avatar, username, password, name, type, phoneNumber, address, email, bills);
//    }

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
