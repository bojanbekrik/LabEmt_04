package com.example.labemt_04.service.impl;

import com.example.labemt_04.model.ShoppingCart;
import com.example.labemt_04.repository.ShoppingCartRepository;
import com.example.labemt_04.service.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public List<ShoppingCart> listAllShoppingCarts() {
        return this.shoppingCartRepository.findAll();
    }

}
