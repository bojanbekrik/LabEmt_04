package com.example.labemt_04.web;

import com.example.labemt_04.model.Admin;
import com.example.labemt_04.model.Bank;
import com.example.labemt_04.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/all")
    public List<Admin> getAllUsers() {
        return this.adminService.listAllAdmins();
    }
}
