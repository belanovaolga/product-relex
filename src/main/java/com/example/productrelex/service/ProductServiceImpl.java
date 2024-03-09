package com.example.productrelex.service;

import com.example.productrelex.dto.CreateProductDto;
import com.example.productrelex.dto.ProductCountDto;
import com.example.productrelex.entity.ProductEntity;
import com.example.productrelex.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(CreateProductDto createProductDto) {
        ProductEntity product = ProductEntity
                .builder()
                .name(createProductDto.getName())
                .unitDto(createProductDto.getUnitDto())
                .count(createProductDto.getCount())
                .build();

        return productRepository.save(product);
    }

    @Override
    public void setCount(ProductCountDto productCountDto) {
        ProductEntity product = productRepository.findByProductId(productCountDto.getProductId());

        product.setCount(product.getCount() + productCountDto.getCount());

        productRepository.save(product);
    }
}
