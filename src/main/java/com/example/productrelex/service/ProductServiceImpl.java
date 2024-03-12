package com.example.productrelex.service;

import com.example.productrelex.dto.ProductDto;
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
    public ProductEntity createProduct(ProductDto productDto) {
        ProductEntity product = ProductEntity
                .builder()
                .name(productDto.getName())
                .unitDto(productDto.getUnitDto())
                .count(productDto.getCount())
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
