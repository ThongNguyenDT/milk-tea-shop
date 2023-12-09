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
@Entity(name = "Bill")
@Table(name = "bill", schema = "WebProject", indexes = {
        @Index(name = "AccountID_idx", columnList = "idAccount")
})
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBill", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAccount")
    @ToString.Exclude
    private Account idAccount;

    @OneToMany(mappedBy = "billID")
    @ToString.Exclude
    private Set<Billinfo> billinfos = new LinkedHashSet<>();

    @Column(name = "isPaid")
    private boolean paid;

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
