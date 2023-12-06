package com.example.web_project.repository;

import com.example.web_project.entities.Addin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddinRepository extends JpaRepository<Addin, Integer> {
    Optional<Addin> findByAddin(String addin);
}
