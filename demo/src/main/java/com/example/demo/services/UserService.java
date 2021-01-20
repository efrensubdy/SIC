package com.example.demo.services;

import com.example.demo.entities.Usuario;
import com.example.demo.repos.UserRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    public UserRpository userRpository;

    @Override
    public Usuario login(String username, String password) {
        return userRpository.findFirstUserByUserNameAndPassword(username, password);
    }
}
