package com.example.web_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class HomeController {
    @RequestMapping({"/", "/home"})
    public String welcome(Map<String, Object> model) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Baseball");
        list.add("Basketball");
        list.add("Cricket");

        model.put("list", list);

        return "home";
    }
}
