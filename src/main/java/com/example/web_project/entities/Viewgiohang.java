package com.example.web_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
@Table(name = "viewgiohang", schema = "test")
public class Viewgiohang {
    @Id
    @NotNull
    @Column(name = "idBillInfo", nullable = false)
    private Integer idBillInfo;

    @Column(name = "idAccount")
    private Integer idAccount;

    @Column(name = "idBill")
    private Integer idBill;

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

    @Size(max = 45)
    @Column(name = "Name", length = 45)
    private String name;

    @Size(max = 2000)
    @Column(name = "Description", length = 2000)
    private String description;

    @Column(name = "Cost")
    private Integer cost;

    @Size(max = 1000)
    @Column(name = "Avatar", length = 1000)
    private String avatar;

}