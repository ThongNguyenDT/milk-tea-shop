package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Earn")
@Table(name = "earn", schema = "test")
public class Earn {
    @Id
    @Column(name = "idEarn", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTime")
    private Time idTime;

    @Column(name = "Earn")
    private Integer earn;

}