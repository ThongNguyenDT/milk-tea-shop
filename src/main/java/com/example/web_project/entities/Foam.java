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
@Entity(name = "Foam")
@Table(name = "foam", schema = "test")
public class Foam {
    @Id
    @Column(name = "idFoam", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "Foam", length = 45)
    private String foam;

    @Column(name = "Cost")
    private Integer cost;

}