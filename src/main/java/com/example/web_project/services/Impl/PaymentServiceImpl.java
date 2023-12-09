package com.example.web_project.services.Impl;

import com.example.web_project.entities.Bill;
import com.example.web_project.entities.Payment;
import com.example.web_project.repository.PaymentRepository;
import com.example.web_project.services.BillService;
import com.example.web_project.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private final PaymentRepository paymentRepository;

    @Autowired
    private final BillService billService;


    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Integer paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }

    @Override
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

    @Override
    public Payment updatePayment(Integer paymentId, Double newAmount) {
        Payment existingPayment = getPaymentById(paymentId);
        if (existingPayment == null) {
            // Handle non-existent payment
            return null;
        }

        existingPayment.setAmount(newAmount);
        return paymentRepository.save(existingPayment);
    }

    @Override
    public void deletePayment(Integer paymentId) {
        paymentRepository.deleteById(paymentId);
    }

    @Override
    public List<Payment> getPaymentsByBillId(Integer billId) {
        return paymentRepository.findByBillId(billId);
    }

    // Additional methods as needed
}
