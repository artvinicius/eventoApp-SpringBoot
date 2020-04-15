package com.arthur.eventoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InderControler {

@RequestMapping("/")
public String index(){
    return "index";
}

}