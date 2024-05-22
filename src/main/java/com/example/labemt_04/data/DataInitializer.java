package com.example.labemt_04.data;

import com.example.labemt_04.model.*;
import com.example.labemt_04.repository.*;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataInitializer {

    private final UserRepository userRepository;
    private final AdminRepository adminRepository;
    private final BankRepository bankRepository;
    private final ShoppingCartRepository shoppingCartRepository;
    private final ProductRepository productRepository;

    public DataInitializer(UserRepository userRepository, AdminRepository adminRepository, BankRepository bankRepository, ShoppingCartRepository shoppingCartRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.adminRepository = adminRepository;
        this.bankRepository = bankRepository;
        this.shoppingCartRepository = shoppingCartRepository;
        this.productRepository = productRepository;
    }

    public static List<User> usersList = null;
    public static List<Admin> adminsList = null;
    public static List<Bank> banksList = null;
    public static List<Product> productList = null;
    public static List<ShoppingCart> shoppingCartList = null;

    @PostConstruct
    public void init() {
        usersList = new ArrayList<>();
        User user = new User("BojanBekrikj","bojan@mail");
        usersList.add(user);
        userRepository.save(user);

        adminsList = new ArrayList<>();
        Admin admin = new Admin("admin");
        adminsList.add(admin);
        adminRepository.save(admin);

        banksList = new ArrayList<>();
        Bank bank = new Bank("Stopanska");
        banksList.add(bank);
        bankRepository.save(bank);

        productList = new ArrayList<>();
        Product product = new Product("Topka", 10);
        productList.add(product);
        productRepository.save(product);

        shoppingCartList = new ArrayList<>();
        ShoppingCart sc = new ShoppingCart(user, productList);
        shoppingCartList.add(sc);
        shoppingCartRepository.save(sc);
    }
}
