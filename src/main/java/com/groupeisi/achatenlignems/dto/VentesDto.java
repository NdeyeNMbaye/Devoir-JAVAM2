package com.groupeisi.achatenlignems.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VentesDto {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    private Date dateP;
    private double quantity;
    private ProduitsDto product;
    private UserAccountDto user;
}