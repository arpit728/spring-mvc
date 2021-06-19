package com.acecademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Alice");
        model.addAttribute("friends", Arrays.asList("Bob", "John"));
        System.out.println("Home URL " + model.getClass());
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("About URL");
        return "about";
    }
    
    
    @RequestMapping("/help")
    public ModelAndView help(ModelAndView modelAndView) {
        System.out.println("Help URL");
       
        modelAndView.addObject("name","arpit");
        modelAndView.setViewName("help");
       
        return modelAndView;
    }
}
