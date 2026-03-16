package com.groupeisi.achatenlignems.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountDto {


    private Long id;

    private String email;

    private String password;
}