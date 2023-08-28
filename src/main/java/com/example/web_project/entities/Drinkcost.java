package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

/**
 * Mapping for DB view
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Drinkcost")
@Immutable
@Table(name = "drinkcost", schema = "WebProject")
public class Drinkcost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDrinkType", nullable = false)
    private Integer idDrinkType;

    @Column(name = "idSize")
    private Integer idSize;

    @Column(name = "sizecost")
    private Integer sizecost;

    @Column(name = "idAddin")
    private Integer idAddin;

    @Column(name = "idTopping")
    private Integer idTopping;

    @Column(name = "toppingcost")
    private Integer toppingcost;

    @Column(name = "idFoam")
    private Integer idFoam;

    @Column(name = "foamcost")
    private Integer foamcost;

    @Column(name = "TotalCost")
    private Long totalCost;

}