package com.groupeisi.achatenlignems.repository;

import com.groupeisi.achatenlignems.entities.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentesRepository extends JpaRepository<Ventes, Long> {
}