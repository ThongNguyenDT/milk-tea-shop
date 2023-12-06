package com.example.web_project.controller.menu;

import com.example.web_project.services.securityService.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class menu {
    private final AuthService authService;

    @RequestMapping({"/alotra/shop"})
    public String shop(Model model) {
        model = authService.common(model);
        return "menu/menu";
    }
    @RequestMapping({"/shop"})
    public String shop1(Model model) {
        model = authService.common(model);
        return "menu/menu";
    }
}
