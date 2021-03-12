package com.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller403 {

    @GetMapping(value = "/403")
    public String error403 () {
        return "/http403";
    }

}
