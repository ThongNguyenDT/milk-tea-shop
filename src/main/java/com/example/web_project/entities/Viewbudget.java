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
@Entity(name = "Viewbudget")
@Immutable
@Table(name = "viewbudget", schema = "WebProject")
public class Viewbudget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTime", nullable = false)
    private Integer idTime;

    @Column(name = "Month")
    private Integer month;

    @Column(name = "Year")
    private Integer year;

    @Column(name = "Cost")
    private Long cost;

    @Column(name = "Earn")
    private Integer earn;

    @Column(name = "Total")
    private Long total;

}