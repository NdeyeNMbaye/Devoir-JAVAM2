package com.groupeisi.achatenlignems.mapper;

import com.groupeisi.achatenlignems.dto.UserAccountDto;
import com.groupeisi.achatenlignems.entities.UserAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserAccountMapper {

    UserAccountDto toDto(UserAccount userAccount);

    UserAccount toEntity(UserAccountDto userAccountDto);
}