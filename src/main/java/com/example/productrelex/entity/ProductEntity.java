package com.example.productrelex.entity;

import com.example.productrelex.dto.UnitDto;
import jakarta.persistence.*;
import lombok.*;

/**
 * класс для добавления нового вида товара в базу данных
 */
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_type")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long productId;

    private String name;

    @Enumerated(EnumType.STRING)
    private UnitDto unitDto;

    private Double count;
}
