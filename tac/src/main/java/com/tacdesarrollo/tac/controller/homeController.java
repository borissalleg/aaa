package com.tacdesarrollo.tac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/home")
public class homeController {

    @RequestMapping(value="/index")
    public String home(){

        return"index";
    }
    
}
