package com.example.web_project.services;

import com.example.web_project.entities.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(Integer paymentId);
    Payment makePayment(Integer billId, Double amount);
    Payment updatePayment(Integer paymentId, Double newAmount);
    void deletePayment(Integer paymentId);
    List<Payment> getPaymentsByBillId(Integer billId);
}
