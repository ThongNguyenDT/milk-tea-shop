package com.example.web_project.controller;

import com.example.web_project.repository.AccountRepository;
import com.example.web_project.services.securityService.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final AccountRepository repository;
    private final AuthService authService;


    @RequestMapping({"/", "/home"})
    public String welcome(Model model) {
        model = authService.common(model);
        return "index";
    }

    @RequestMapping({"/alotra"})
    public String test(Map<String, Object> model) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Baseball");
        list.add("Basketball");
        list.add("Cricket");

        model.put("list", list);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.isAuthenticated()) {
            String name = auth.getName();
            if (repository.findByUsername(name).isPresent())
                model.put("username", name);
        }


        return "home";
    }
}
