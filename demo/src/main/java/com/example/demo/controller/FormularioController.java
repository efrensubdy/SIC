package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("formu")
public class FormularioController {

    @RequestMapping(value = "formi", method = RequestMethod.GET)
    public String cosito(){
        String a;
        try {
            //obtener datos que se enviarán a través del API
            a="fsdffsdsdfdf";
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
        return a;
    }


}
