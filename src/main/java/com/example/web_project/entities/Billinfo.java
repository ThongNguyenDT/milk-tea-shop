package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Billinfo")
@Table(name = "billinfo", schema = "WebProject", indexes = {
        @Index(name = "BillID_idx", columnList = "BillID"),
        @Index(name = "ProductID_idx", columnList = "ProductID"),
        @Index(name = "DrinkTypeID_idx", columnList = "DrinkTypeID")
})
public class Billinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBillInfo", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BillID")
    @ToString.Exclude
    private Bill billID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductID")
    @ToString.Exclude
    private Product productID;

    @Column(name = "Count")
    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DrinkTypeID")
    @ToString.Exclude
    private Drinktype drinkTypeID;

}