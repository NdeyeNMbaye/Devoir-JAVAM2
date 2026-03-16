package com.groupeisi.achatenlignems.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitsDto {

    private String ref;
    private String name;
    private double stock;
    private UserAccountDto user;
}