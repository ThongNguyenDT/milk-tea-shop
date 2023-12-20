package com.example.web_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Size")
@Table(name = "size", schema = "test")
public class Size {
    @Id
    @Column(name = "idSize", nullable = false)
    private Integer id;

    @jakarta.validation.constraints.Size(max = 45)
    @Column(name = "Size", length = 45)
    private String size;

    @Column(name = "Cost")
    private Integer cost;

}