package com.example.web_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Viewmonth")
@Immutable
@Table(name = "viewmonth", schema = "test")
public class Viewmonth {
    @Id
    @Column(name = "Earn", precision = 52)
    private BigDecimal earn;

    @Column(name = "Customers", precision = 32)
    private BigDecimal customers;

    @Column(name = "Products", precision = 32)
    private BigDecimal products;

}