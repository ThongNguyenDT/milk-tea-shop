package com.example.web_project.controller.menu;

import com.example.web_project.entities.Product;
import com.example.web_project.services.securityService.AuthService;
import com.example.web_project.services.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class menu {
    private final AuthService authService;
    private final ProductService productService;

    @RequestMapping({"/alotra/shop"})
    public String shop(Model model) {
        return "redirect:/shop";
    }
    @RequestMapping({"/shop"})
    public String shop1(Model model) {
        model = authService.common(model);
        return "menu/menu1";
    }

    @ModelAttribute("teaProducts")
    public List<Product> getTeaProducts() {
        return productService.getProductsByCategory("Tea");
    }

    @ModelAttribute("milkTeaProducts")
    public List<Product> getMilkTeaProducts() {
        return productService.getProductsByCategory("Milk Tea");
    }

    @ModelAttribute("coffeeProducts")
    public List<Product> getCoffeeProducts() {
        return productService.getProductsByCategory("Coffee");
    }


    @ModelAttribute("cakeProducts")
    public List<Product> getCakeProducts() {
        return productService.getProductsByCategory("Cake");
    }

    @ModelAttribute("breadProducts")
    public List<Product> getBreadProducts() {
        return productService.getProductsByCategory("Bread");
    }

    @ModelAttribute("otherProducts")
    public List<Product> getOtherProducts() {
        return productService.getProductsByCategory("Other");
    }

}