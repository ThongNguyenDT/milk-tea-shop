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
@Entity(name = "Product")
@Table(name = "product", schema = "WebProject")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct", nullable = false)
    private Integer id;

    @Column(name = "Name", length = 45)
    private String name;

    @Column(name = "Description", length = 2000)
    private String description;

    @Column(name = "Cost")
    private Integer cost;

    @Column(name = "Avatar", length = 45)
    private String avatar;

    @OneToMany(mappedBy = "productID")
    private Set<Billinfo> billinfos = new LinkedHashSet<>();

}