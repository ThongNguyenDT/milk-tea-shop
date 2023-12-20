package com.example.web_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Topping")
@Table(name = "topping", schema = "test")
public class Topping {
    @Id
    @Column(name = "idTopping", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "Topping", length = 45)
    private String topping;

    @Column(name = "Cost")
    private Integer cost;

}