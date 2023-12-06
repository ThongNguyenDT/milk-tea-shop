package com.example.web_project.services;

import com.example.web_project.entities.Bill;
import com.example.web_project.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    private final BillRepository billRepository;

    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    public Bill findById(Integer id) {
        Optional<Bill> optionalBill = billRepository.findById(id);
        return optionalBill.orElse(null);
    }

    public Bill save(Bill bill) {
        return billRepository.save(bill);
    }

    public void delete(Integer id) {
        billRepository.deleteById(id);
    }

    // Additional methods as needed
}
