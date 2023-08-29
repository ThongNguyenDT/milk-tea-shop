package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Time")
@Table(name = "time", schema = "WebProject")
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTime", nullable = false)
    private Integer id;

    @Column(name = "Month")
    private Integer month;

    @Column(name = "Year")
    private Integer year;

    @OneToMany(mappedBy = "idTime")
    private Set<Cost> costs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idTime")
    private Set<Earn> earns = new LinkedHashSet<>();

}