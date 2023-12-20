package com.example.web_project.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Drinktype")
@Table(name = "drinktype", schema = "test")
public class Drinktype {
    @Id
    @Column(name = "id_Drink_Type", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SizeID")
    private Size sizeID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FoamID")
    private Foam foamID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ToppingID")
    private Topping toppingID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AddinID")
    private Addin addinID;
    public Drinktype(Integer id) {
        this.id  = id;
    }

}