package com.example.labemt_04.service.impl;

import com.example.labemt_04.model.Product;
import com.example.labemt_04.repository.ProductRepository;
import com.example.labemt_04.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> listAllProducts() {
        return this.productRepository.findAll();
    }
}
