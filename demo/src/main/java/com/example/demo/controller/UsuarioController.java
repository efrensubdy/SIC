package com.example.demo.controller;

import com.example.demo.entities.Usuario;
import com.example.demo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UsuarioController {
    static final String origen = "*";
    @Autowired
    private IUserService userService;
    @CrossOrigin(origins = origen)
    @RequestMapping(value = "login/{username}/{password}", method = RequestMethod.GET)
    public Usuario obetenerUserForLogin(@PathVariable String username, @PathVariable String password){
        Usuario a= new Usuario();
        try {
            //obtener datos que se enviarán a través del API
            a =userService.login(username,password);
        } catch (Exception ex) {
            System.out.println("eRROR");
        }
        return a;
    }
}
