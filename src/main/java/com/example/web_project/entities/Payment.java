package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Payment")
@Table(name = "payment", schema = "WebProject")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPayment", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idBill")
    private Bill bill;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "paymentDate", columnDefinition = "DATETIME")
    private Date paymentDate;


    // Getters and setters
}
