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
@Entity(name = "Foam")
@Table(name = "foam", schema = "WebProject")
public class Foam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoam", nullable = false)
    private Integer id;

    @Column(name = "Foam", length = 45)
    private String foam;

    @Column(name = "Cost")
    private Integer cost;

    @OneToMany(mappedBy = "foamID")
    private Set<Drinktype> drinktypes = new LinkedHashSet<>();

}