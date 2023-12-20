package com.example.web_project.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Bill")
@Table(name = "bill", schema = "WebProject")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBill", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAccount")
    @ToString.Exclude
    @JsonBackReference
    private Account idAccount;

    @OneToMany(mappedBy = "billID", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<Billinfo> billinfos = new LinkedHashSet<>();


    @Column(name = "isPaid")
    private Boolean paid;

}
