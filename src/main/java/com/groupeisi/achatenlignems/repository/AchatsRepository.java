package com.groupeisi.achatenlignems.repository;

import com.groupeisi.achatenlignems.entities.Achats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchatsRepository extends JpaRepository<Achats, Long> {
}