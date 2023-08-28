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
@Entity(name = "Cost")
@Table(name = "cost", schema = "WebProject", indexes = {
        @Index(name = "TimeID_idx", columnList = "idTime")
})
public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCost", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTime")
    @ToString.Exclude
    private Time idTime;

    @Column(name = "`Human resources`")
    private Integer humanResources;

    @Column(name = "Ingredient")
    private Integer ingredient;

    @Column(name = "Infrastructure")
    private Integer infrastructure;

}