package com.example.web_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class admin {
    @RequestMapping("/dashboard")
    public String welcome(Model model) {
        return "redirect:/admin";
    }

    @GetMapping({"/admin", "/admin/{}"})
    public String adminView() {
        String jwt = "";
        return "redirect:https://admin-dashboard-6yw658bae-nhocthongmap123.vercel.app/admin?jwt=" + jwt ;
    }
}
