package com.example.web_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Product")
@Table(name = "product", schema = "test")
public class Product {
    @Id
    @Column(name = "idProduct", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "Name", length = 45)
    private String name;

    @Size(max = 2000)
    @Column(name = "Description", length = 2000)
    private String description;

    @Column(name = "Cost")
    private Integer cost;

    @Size(max = 1000)
    @Column(name = "Avatar", length = 1000)
    private String avatar;

    @Size(max = 45)
    @NotNull
    @Column(name = "Category", nullable = false, length = 45)
    private String category;

}