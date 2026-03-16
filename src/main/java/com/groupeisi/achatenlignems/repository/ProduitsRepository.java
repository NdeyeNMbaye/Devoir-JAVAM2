package com.groupeisi.achatenlignems.repository;

import com.groupeisi.achatenlignems.entities.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitsRepository extends JpaRepository<Produits, String> {
}