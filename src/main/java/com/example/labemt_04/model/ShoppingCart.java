package com.example.labemt_04.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    User user;

    @OneToMany
    List<Product> productList;

    public ShoppingCart(User user, List<Product> productList) {
        this.user = user;
        this.productList = productList;
    }

    public ShoppingCart() {
    }
}
