package com.example.web_project.repository;

import com.example.web_project.entities.Account;
import com.example.web_project.entities.Bill;
import com.example.web_project.entities.Billinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillInfoRepository extends JpaRepository<Billinfo, Integer> {
}
