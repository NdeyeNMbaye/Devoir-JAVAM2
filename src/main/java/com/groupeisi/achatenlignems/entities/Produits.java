package com.groupeisi.achatenlignems.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "produits")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produits {

    @Id
    private String ref;

    private String name;

    private double stock;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserAccount user;
}