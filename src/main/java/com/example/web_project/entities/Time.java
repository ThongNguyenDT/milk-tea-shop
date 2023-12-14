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
@Entity(name = "Time")
@Table(name = "time", schema = "test")
public class Time {
    @Id
    @Column(name = "idTime", nullable = false)
    private Integer id;

    @Column(name = "Month")
    private Integer month;

    @Column(name = "Year")
    private Integer year;

}