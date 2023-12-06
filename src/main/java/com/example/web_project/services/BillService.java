package com.example.web_project.services;

import com.example.web_project.entities.Bill;

import java.util.List;

public interface BillService {
    List<Bill> getAllBills();

    Bill findById(Integer id);

    Bill save(Bill bill);

    void delete(Integer id);
}
