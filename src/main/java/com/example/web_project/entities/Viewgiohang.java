package com.example.web_project.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Immutable
@Entity(name = "Viewgiohang")
@Table(name = "Viewgiohang", schema = "test")
public class Viewgiohang {
    @Id
    @NotNull
    @Column(name = "id_bill_info", nullable = false)
    private Integer id_bill_info;

    @Column(name = "id_Account")
    private Integer idAccount;

    @Column(name = "id_Bill")
    private Integer billID;

    @Column(name = "ProductID")
    private Integer productID;

    @Column(name = "Count")
    private Integer count;

    @Column(name = "drink_typeid")
    private Integer drink_typeid;

    @Size(max = 45)
    @Column(name = "username",length = 45)
    private String username;

    @Column(name = "product_cost")
    private Integer product_cost;

    @Size(max = 1000)
    @Column(name = "product_name", length = 1000)
    private String product_name;

    @Size(max = 1000)
    @Column(name = "description", length = 1000)
    private String description;

    @Size(max = 2000)
    @Column(name = "Avatar", length =2000)
    private String Avatar;

    @Column(name = "drink_type_cost")
    private Integer drink_type_cost;

    @Column(name = "total_cost")
    private Integer total_cost;

}