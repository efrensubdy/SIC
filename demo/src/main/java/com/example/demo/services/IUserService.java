package com.example.demo.services;

import com.example.demo.entities.Usuario;

public interface IUserService {
    public Usuario login (String username, String password);
}
