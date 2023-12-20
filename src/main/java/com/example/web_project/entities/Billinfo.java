package com.example.web_project.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBillInfo", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BillID")
    @ToString.Exclude
    @JsonBackReference
    private Bill billID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductID")
    @JsonBackReference
    private Product productID;

    @Column(name = "Count")
    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DrinkTypeID")
    @JsonBackReference
    private Drinktype drinkTypeID;

    // Constructors, getters, and setters...

    // Ensure you set the associated entities before saving
    public void setAssociatedEntities(Bill bill, Product product, Drinktype drinktype) {
        this.billID = bill;
        this.productID = product;
        this.drinkTypeID = drinktype;
    }
}
