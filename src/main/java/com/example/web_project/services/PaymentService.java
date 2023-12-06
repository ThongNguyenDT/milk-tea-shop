package com.example.web_project.services;

import com.example.web_project.entities.Bill;
import com.example.web_project.entities.Payment;
import com.example.web_project.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final BillService billService;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository, BillService billService) {
        this.paymentRepository = paymentRepository;
        this.billService = billService;
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Integer paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }

    public Payment makePayment(Integer billId, Double amount) {
        Bill bill = billService.findById(billId);
        if (bill == null || bill.isPaid()) {
            // Handle invalid bill or already paid
            return null;
        }

        Payment payment = Payment.builder()
                .bill(bill)
                .amount(amount)
                .build();

        paymentRepository.save(payment);

        // Update Bill status to paid
        bill.setPaid(true);
        billService.save(bill);

        return payment;
    }

    public Payment updatePayment(Integer paymentId, Double newAmount) {
        Payment existingPayment = getPaymentById(paymentId);
        if (existingPayment == null) {
            // Handle non-existent payment
            return null;
        }

        existingPayment.setAmount(newAmount);
        return paymentRepository.save(existingPayment);
    }

    public void deletePayment(Integer paymentId) {
        paymentRepository.deleteById(paymentId);
    }

    public List<Payment> getPaymentsByBillId(Integer billId) {
        return paymentRepository.findByBillId(billId);
    }

    // Additional methods as needed
}
