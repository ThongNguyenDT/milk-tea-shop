package com.example.web_project.entities;

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
@Entity(name = "Drinktype")
@Table(name = "drinktype", schema = "WebProject", indexes = {
        @Index(name = "SizeID_idx", columnList = "SizeID"),
        @Index(name = "FoamID_idx", columnList = "FoamID"),
        @Index(name = "ToppingID_idx", columnList = "ToppingID"),
        @Index(name = "AddinID_idx", columnList = "AddinID")
})
public class Drinktype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDrinkType", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SizeID")
    @ToString.Exclude
    private Size sizeID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FoamID")
    @ToString.Exclude
    private Foam foamID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ToppingID")
    @ToString.Exclude
    private Topping toppingID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AddinID")
    @ToString.Exclude
    private Addin addinID;

    @OneToMany(mappedBy = "drinkTypeID")
    @ToString.Exclude
    private Set<Billinfo> billinfos = new LinkedHashSet<>();

}