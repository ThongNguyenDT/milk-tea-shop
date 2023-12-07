package com.example.web_project.repository;

import com.example.web_project.entities.LoginCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginCredential, Long> {
    LoginCredential findByUserName(String userName);
}
