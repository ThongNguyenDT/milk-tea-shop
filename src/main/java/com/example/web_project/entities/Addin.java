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
@Entity(name = "Addin")
@Table(name = "addin", schema = "WebProject")
public class Addin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAddin", nullable = false)
    private Integer id;

    @Column(name = "Addin", length = 45)
    private String addin;

    @OneToMany(mappedBy = "addinID")
    @ToString.Exclude
    private Set<Drinktype> drinktypes = new LinkedHashSet<>();

}