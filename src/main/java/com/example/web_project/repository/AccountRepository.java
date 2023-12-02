package com.example.web_project.repository;


import com.example.web_project.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Optional<? extends Account> findByUsername(String username);
    Optional<? extends Account> findByEmail(String username);
}