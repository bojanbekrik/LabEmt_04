package com.example.labemt_04.service.impl;

import com.example.labemt_04.model.Admin;
import com.example.labemt_04.repository.AdminRepository;
import com.example.labemt_04.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public List<Admin> listAllAdmins() {
        return this.adminRepository.findAll();
    }
}
