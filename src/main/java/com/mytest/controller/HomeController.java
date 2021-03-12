package com.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public ModelAndView home () {

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("messageHelloWorld", "Главная страница");

        return modelAndView;

    }

}