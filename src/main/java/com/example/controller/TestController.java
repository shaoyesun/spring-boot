package com.example.controller;

import com.example.entity.AuthorSettings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 17-2-13.
 */
@Controller
public class TestController {

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/leaf")
    String leaf(Model model){
        model.addAttribute("name", authorSettings.getName());
        model.addAttribute("age", authorSettings.getAge());
        return "index";
    }
}
