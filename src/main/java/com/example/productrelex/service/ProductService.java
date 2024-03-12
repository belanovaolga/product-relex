package com.example.productrelex.service;

import com.example.productrelex.dto.ProductDto;
import com.example.productrelex.dto.ProductCountDto;
import com.example.productrelex.entity.ProductEntity;

public interface ProductService {
    ProductEntity createProduct(ProductDto productDto);

    void setCount(ProductCountDto productCountDto);
}
