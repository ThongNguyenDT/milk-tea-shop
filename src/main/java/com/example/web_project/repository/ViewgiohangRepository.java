package com.example.web_project.repository;

import com.example.web_project.entities.Viewgiohang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewgiohangRepository extends JpaRepository<Viewgiohang, Integer> {
    List<Viewgiohang> findByBillID(Integer billID);
    List<Viewgiohang> findByUsername(String username);

}