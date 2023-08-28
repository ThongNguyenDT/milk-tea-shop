package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Earn")
@Table(name = "earn", schema = "WebProject", indexes = {
        @Index(name = "idTime_idx", columnList = "idTime")
})
public class Earn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEarn", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTime")
    @ToString.Exclude
    private Time idTime;

    @Column(name = "Earn")
    private Integer earn;

}