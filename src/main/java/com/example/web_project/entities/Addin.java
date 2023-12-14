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
@Entity(name = "Addin")
@Table(name = "addin", schema = "test")
public class Addin {
    @Id
    @Column(name = "idAddin", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "Addin", length = 45)
    private String addin;

}