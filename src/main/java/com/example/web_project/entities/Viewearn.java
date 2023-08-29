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
@Entity(name = "Viewearn")
@Immutable
@Table(name = "viewearn", schema = "WebProject")
public class Viewearn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBillInfo", nullable = false)
    private Integer idBillInfo;

    @Column(name = "productid")
    private Integer productid;

    @Column(name = "Cost")
    private Integer cost;

    @Column(name = "drinktypeid")
    private Integer drinktypeid;

    @Column(name = "TotalCost")
    private Long totalCost;

    @Column(name = "count")
    private Integer count;

    @Column(name = "Total")
    private Long total;

}