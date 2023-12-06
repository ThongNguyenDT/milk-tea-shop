package com.example.web_project.repository;

import com.example.web_project.entities.Account;
import com.example.web_project.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {
    List<Bill> findAllByIdAccount(Account account);
}
