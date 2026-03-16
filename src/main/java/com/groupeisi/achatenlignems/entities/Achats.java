package com.groupeisi.achatenlignems.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "achats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Achats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dateP;

    private double quantity;

    @ManyToOne
    @JoinColumn(name = "product_ref")
    private Produits product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserAccount user;
}