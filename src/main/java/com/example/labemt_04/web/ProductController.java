package com.example.labemt_04.web;

import com.example.labemt_04.model.Product;
import com.example.labemt_04.model.ShoppingCart;
import com.example.labemt_04.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return this.productService.listAllProducts();
    }
}
