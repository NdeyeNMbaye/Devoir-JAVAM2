package com.groupeisi.achatenlignems.service;

import com.groupeisi.achatenlignems.dto.VentesDto;
import com.groupeisi.achatenlignems.entities.Ventes;
import com.groupeisi.achatenlignems.mapper.VentesMapper;
import com.groupeisi.achatenlignems.repository.VentesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class VentesService {

    private final VentesRepository ventesRepository;
    private final VentesMapper ventesMapper;

    public List<VentesDto> findAll() {
        log.info("Récupération de toutes les ventes");
        return ventesRepository.findAll()
                .stream()
                .map(ventesMapper::toDto)
                .collect(Collectors.toList());
    }

    public VentesDto findById(Long id) {
        log.info("Récupération de la vente avec l'id : {}", id);
        return ventesRepository.findById(id)
                .map(ventesMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Vente non trouvée avec l'id : " + id));
    }

    public VentesDto save(VentesDto ventesDto) {
        log.info("Sauvegarde de la vente");
        Ventes ventes = ventesMapper.toEntity(ventesDto);
        ventes.setId(null);
        return ventesMapper.toDto(ventesRepository.save(ventes));
    }

    public VentesDto update(Long id, VentesDto ventesDto) {
        log.info("Mise à jour de la vente avec l'id : {}", id);
        ventesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vente non trouvée avec l'id : " + id));
        Ventes ventes = ventesMapper.toEntity(ventesDto);
        ventes.setId(id);
        return ventesMapper.toDto(ventesRepository.save(ventes));
    }

    public void delete(Long id) {
        log.info("Suppression de la vente avec l'id : {}", id);
        ventesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vente non trouvée avec l'id : " + id));
        ventesRepository.deleteById(id);
    }
}