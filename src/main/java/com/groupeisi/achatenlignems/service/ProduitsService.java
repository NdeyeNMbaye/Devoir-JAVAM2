package com.groupeisi.achatenlignems.service;

import com.groupeisi.achatenlignems.dto.ProduitsDto;
import com.groupeisi.achatenlignems.entities.Produits;
import com.groupeisi.achatenlignems.entities.UserAccount;
import com.groupeisi.achatenlignems.mapper.ProduitsMapper;
import com.groupeisi.achatenlignems.repository.ProduitsRepository;
import com.groupeisi.achatenlignems.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProduitsService {

    private final ProduitsRepository produitsRepository;
    private final ProduitsMapper produitsMapper;
    private final UserAccountRepository userAccountRepository;

    public List<ProduitsDto> findAll() {
        log.info("Récupération de tous les produits");
        return produitsRepository.findAll()
                .stream()
                .map(produitsMapper::toDto)
                .collect(Collectors.toList());
    }

    public ProduitsDto findById(String ref) {
        log.info("Récupération du produit avec la ref : {}", ref);
        return produitsRepository.findById(ref)
                .map(produitsMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé avec la ref : " + ref));
    }

    public ProduitsDto save(ProduitsDto produitsDto) {
        log.info("Sauvegarde du produit : {}", produitsDto.getName());
        Produits produits = produitsMapper.toEntity(produitsDto);
        if (produitsDto.getUser() != null && produitsDto.getUser().getId() != null) {
            UserAccount user = userAccountRepository.findById(produitsDto.getUser().getId())
                    .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
            produits.setUser(user);
        }
        return produitsMapper.toDto(produitsRepository.save(produits));
    }

    public ProduitsDto update(String ref, ProduitsDto produitsDto) {
        log.info("Mise à jour du produit avec la ref : {}", ref);
        produitsRepository.findById(ref)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé avec la ref : " + ref));
        Produits produits = produitsMapper.toEntity(produitsDto);
        produits.setRef(ref);
        return produitsMapper.toDto(produitsRepository.save(produits));
    }

    public void delete(String ref) {
        log.info("Suppression du produit avec la ref : {}", ref);
        produitsRepository.findById(ref)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé avec la ref : " + ref));
        produitsRepository.deleteById(ref);
    }
}