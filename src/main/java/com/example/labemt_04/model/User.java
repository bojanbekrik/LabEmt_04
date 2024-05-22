package com.example.labemt_04.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nameAndSurname;

    String email;

    public User(String nameAndSurname, String email) {
        this.nameAndSurname = nameAndSurname;
        this.email = email;
    }

    public User() {
    }
}
