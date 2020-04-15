package com.arthur.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoCotroller {

    @RequestMapping("/cadastrarEvento")
    public String form(){
        return "evento/formEvento";   //Diretorio onde está o arquivo html 
    }
    
}