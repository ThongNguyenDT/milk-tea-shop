package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Cost")
@Table(name = "cost", schema = "test")
public class Cost {
    @Id
    @Column(name = "idCost", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTime")
    private Time idTime;

    @Column(name = "`Human resources`")
    private Integer humanResources;

    @Column(name = "Ingredient")
    private Integer ingredient;

    @Column(name = "Infrastructure")
    private Integer infrastructure;

}