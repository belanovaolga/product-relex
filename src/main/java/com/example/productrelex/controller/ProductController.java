package com.example.productrelex.controller;

import com.example.productrelex.service.ProductService;
import com.example.productrelex.entity.ProductEntity;
import com.example.productrelex.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    /**
     * создание нового вида товара
     * @param productDto данные, необходимые для создания нового вида товара (
     *                         имя товара,
     *                         единица измерения,
     *                         изначальное количество товара)
     * @return созданный вид товара
     */
    @PostMapping("/createProduct")
    public ProductEntity createProduct(
            @RequestBody ProductDto productDto
            ) {
        return productService.createProduct(productDto);
    }

    /**
     * изменение количества товара в базе данных, после добавления сотрудником
     * @param productCountDto данные, необходимые для занесения собранного товара в базу данных (
     *                            идентификационный номер товара,
     *                            количество собранного товара)
     */
    @PostMapping("/addProduct")
    @ResponseBody
    public void setCount(
            @RequestBody ProductCountDto productCountDto
    ) {
        productService.setCount(productCountDto);
    }
}
