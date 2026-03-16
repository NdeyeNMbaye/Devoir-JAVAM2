package com.groupeisi.achatenlignems.mapper;

import com.groupeisi.achatenlignems.dto.AchatsDto;
import com.groupeisi.achatenlignems.entities.Achats;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProduitsMapper.class, UserAccountMapper.class})
public interface AchatsMapper {

    AchatsDto toDto(Achats achats);

    Achats toEntity(AchatsDto achatsDto);
}