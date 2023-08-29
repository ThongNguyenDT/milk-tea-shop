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
@Entity(name = "Size")
@Table(name = "size", schema = "WebProject")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSize", nullable = false)
    private Integer id;

    @Column(name = "Size", length = 45)
    private String size;

    @Column(name = "Cost")
    private Integer cost;

    @OneToMany(mappedBy = "sizeID")
    private Set<Drinktype> drinktypes = new LinkedHashSet<>();

}