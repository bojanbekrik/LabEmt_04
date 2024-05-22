package com.example.labemt_04.web;

import com.example.labemt_04.model.ShoppingCart;
import com.example.labemt_04.model.User;
import com.example.labemt_04.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shoppingcart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/all")
    public List<ShoppingCart> getAllShoppingCarts() {
        return this.shoppingCartService.listAllShoppingCarts();
    }
}
