package com.example.web_project.repository;

import com.example.web_project.entities.Account;
import com.example.web_project.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {

    @Query("SELECT b FROM Bill b WHERE b.idAccount.id = :idAccount AND b.paid = false")
    List<Bill> findUnpaidBillByAccountId(@Param("idAccount") int idAccount);
}
