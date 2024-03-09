package com.example.productrelex.dto;

import lombok.*;

/**
 * класс для создания нового вида товара
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductDto {
    private String name;

    private UnitDto unitDto;

    private Double count;
}
