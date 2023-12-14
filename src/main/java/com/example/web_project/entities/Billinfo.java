package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Billinfo")
@Table(name = "billinfo", schema = "test")
public class Billinfo {
    @Id
    @Column(name = "idBillInfo", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BillID")
    private Bill billID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductID")
    private Product productID;

    @Column(name = "Count")
    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DrinkTypeID")
    private Drinktype drinkTypeID;

}