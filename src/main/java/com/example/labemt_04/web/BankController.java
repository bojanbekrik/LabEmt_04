package com.example.labemt_04.web;

import com.example.labemt_04.model.Bank;
import com.example.labemt_04.model.User;
import com.example.labemt_04.service.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bank")
public class BankController {
    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/all")
    public List<Bank> getAllUsers() {
        return this.bankService.listAllBanks();
    }
}
