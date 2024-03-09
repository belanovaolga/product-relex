package com.example.productrelex.dto;

import lombok.*;

/**
 * класс для занесения собранного товара в базу данных
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCountDto {
    private Long productId;
    private Double count;
}
