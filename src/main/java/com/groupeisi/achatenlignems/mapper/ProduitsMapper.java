package com.groupeisi.achatenlignems.mapper;

import com.groupeisi.achatenlignems.dto.ProduitsDto;
import com.groupeisi.achatenlignems.entities.Produits;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserAccountMapper.class})
public interface ProduitsMapper {

    ProduitsDto toDto(Produits produits);

    Produits toEntity(ProduitsDto produitsDto);
}