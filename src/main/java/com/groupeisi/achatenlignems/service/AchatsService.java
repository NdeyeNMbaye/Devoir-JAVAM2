package com.groupeisi.achatenlignems.service;

import com.groupeisi.achatenlignems.dto.AchatsDto;
import com.groupeisi.achatenlignems.entities.Achats;
import com.groupeisi.achatenlignems.mapper.AchatsMapper;
import com.groupeisi.achatenlignems.repository.AchatsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class AchatsService {

    private final AchatsRepository achatsRepository;
    private final AchatsMapper achatsMapper;

    public List<AchatsDto> findAll() {
        log.info("Récupération de tous les achats");
        return achatsRepository.findAll()
                .stream()
                .map(achatsMapper::toDto)
                .collect(Collectors.toList());
    }
    @Cacheable(value = "achats", key = "#id")
    public AchatsDto findById(Long id) {
        log.info("Récupération de l'achat avec l'id : {}", id);
        return achatsRepository.findById(id)
                .map(achatsMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Achat non trouvé avec l'id : " + id));
    }

    public AchatsDto save(AchatsDto achatsDto) {
        log.info("Sauvegarde de l'achat");
        Achats achats = achatsMapper.toEntity(achatsDto);
        achats.setId(null); // ← ajouter
        return achatsMapper.toDto(achatsRepository.save(achats));
    }
    @CachePut(value = "achats", key = "#id")
    public AchatsDto update(Long id, AchatsDto achatsDto) {
        log.info("Mise à jour de l'achat avec l'id : {}", id);
        achatsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Achat non trouvé avec l'id : " + id));
        Achats achats = achatsMapper.toEntity(achatsDto);
        achats.setId(id);
        return achatsMapper.toDto(achatsRepository.save(achats));
    }
    @CacheEvict(value = "achats", key = "#id")
    public void delete(Long id) {
        log.info("Suppression de l'achat avec l'id : {}", id);
        achatsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Achat non trouvé avec l'id : " + id));
        achatsRepository.deleteById(id);
    }
}