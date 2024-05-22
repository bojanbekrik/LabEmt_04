package com.example.labemt_04.service.impl;

import com.example.labemt_04.model.User;
import com.example.labemt_04.repository.UserRepository;
import com.example.labemt_04.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listAllUsers() {
        return this.userRepository.findAll();
    }
}
