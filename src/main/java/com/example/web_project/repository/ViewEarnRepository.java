package com.example.web_project.repository;

import com.example.web_project.entities.Viewearn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewEarnRepository  extends JpaRepository<Viewearn, Integer> {
}
