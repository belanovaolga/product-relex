package com.example.productrelex.service;

import com.example.productrelex.dto.CreateProductDto;
import com.example.productrelex.dto.ProductCountDto;
import com.example.productrelex.entity.ProductEntity;

public interface ProductService {
    ProductEntity createProduct(CreateProductDto createProductDto);

    void setCount(ProductCountDto productCountDto);
}
