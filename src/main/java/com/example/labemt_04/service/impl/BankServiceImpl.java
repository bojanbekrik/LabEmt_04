package com.example.labemt_04.service.impl;

import com.example.labemt_04.model.Bank;
import com.example.labemt_04.repository.BankRepository;
import com.example.labemt_04.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;

    public BankServiceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public List<Bank> listAllBanks() {
        return this.bankRepository.findAll();
    }
}
