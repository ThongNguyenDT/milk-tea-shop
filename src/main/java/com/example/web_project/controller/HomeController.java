package com.example.web_project.controller;

import com.example.web_project.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    ItemService itemService;

    @RequestMapping("/view-items")
    public ModelAndView viewBooks(ModelAndView model) {

        model.setViewName("view-items");
        model.addObject("items", itemService.getAll());
        return model;
    }
}
