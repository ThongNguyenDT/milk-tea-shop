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
@Entity(name = "Topping")
@Table(name = "topping", schema = "WebProject")
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTopping", nullable = false)
    private Integer id;

    @Column(name = "Topping", length = 45)
    private String topping;

    @Column(name = "Cost")
    private Integer cost;

    @OneToMany(mappedBy = "toppingID")
    private Set<Drinktype> drinktypes = new LinkedHashSet<>();

}