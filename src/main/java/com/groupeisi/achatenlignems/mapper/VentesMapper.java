package com.groupeisi.achatenlignems.mapper;

import com.groupeisi.achatenlignems.dto.VentesDto;
import com.groupeisi.achatenlignems.entities.Ventes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProduitsMapper.class, UserAccountMapper.class})
public interface VentesMapper {

    VentesDto toDto(Ventes ventes);

    Ventes toEntity(VentesDto ventesDto);
}