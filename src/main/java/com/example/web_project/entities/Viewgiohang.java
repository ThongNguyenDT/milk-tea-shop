package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Viewgiohang")
@Immutable
@Table(name = "viewgiohang", schema = "WebProject")
public class Viewgiohang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAccount")
    private Integer idAccount;

    @Column(name = "idBill")
    private Integer idBill;

    @Column(name = "idBillInfo", nullable = false)
    private Integer idBillInfo;

    @Column(name = "BillID")
    private Integer billID;

    @Column(name = "ProductID")
    private Integer productID;

    @Column(name = "Count")
    private Integer count;

    @Column(name = "DrinkTypeID")
    private Integer drinkTypeID;

    @Column(name = "idProduct")
    private Integer idProduct;

    @Column(name = "Name", length = 45)
    private String name;

    @Column(name = "Description", length = 2000)
    private String description;

    @Column(name = "Cost")
    private Integer cost;

    @Column(name = "Avatar", length = 45)
    private String avatar;
    @Transient
    private Integer quantity;

}