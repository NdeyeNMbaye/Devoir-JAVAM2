package com.groupeisi.achatenlignems.service;

import com.groupeisi.achatenlignems.dto.UserAccountDto;
import com.groupeisi.achatenlignems.entities.UserAccount;
import com.groupeisi.achatenlignems.mapper.UserAccountMapper;
import com.groupeisi.achatenlignems.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserAccountService {

    private final UserAccountRepository userAccountRepository;
    private final UserAccountMapper userAccountMapper;

    public List<UserAccountDto> findAll() {
        log.info("Récupération de tous les utilisateurs");
        return userAccountRepository.findAll()
                .stream()
                .map(userAccountMapper::toDto)
                .collect(Collectors.toList());
    }

    public UserAccountDto findById(Long id) {
        log.info("Récupération de l'utilisateur avec l'id : {}", id);
        return userAccountRepository.findById(id)
                .map(userAccountMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'id : " + id));
    }

    public UserAccountDto save(UserAccountDto userAccountDto) {
        log.info("Sauvegarde de l'utilisateur : {}", userAccountDto.getEmail());
        UserAccount userAccount = userAccountMapper.toEntity(userAccountDto);
        userAccount.setId(null);
        return userAccountMapper.toDto(userAccountRepository.save(userAccount));
    }

    public UserAccountDto update(Long id, UserAccountDto userAccountDto) {
        log.info("Mise à jour de l'utilisateur avec l'id : {}", id);
        userAccountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'id : " + id));
        UserAccount userAccount = userAccountMapper.toEntity(userAccountDto);
        userAccount.setId(id);
        return userAccountMapper.toDto(userAccountRepository.save(userAccount));
    }

    public void delete(Long id) {
        log.info("Suppression de l'utilisateur avec l'id : {}", id);
        userAccountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'id : " + id));
        userAccountRepository.deleteById(id);
    }
}