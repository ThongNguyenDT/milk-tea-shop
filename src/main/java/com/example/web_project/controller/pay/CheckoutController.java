package com.example.web_project.controller.pay;

import com.example.web_project.entities.Viewgiohang;
import com.example.web_project.services.ViewgiohangService;
import com.example.web_project.services.securityService.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CheckoutController {

    @Autowired
    private final ViewgiohangService viewgiohangService;
    private final AuthService authService;
    @GetMapping("/alotra/checkout")
    public String showCheckoutPage(Model model) {
        model = authService.common(model);
        List<Viewgiohang> cartInformation = viewgiohangService.getAllViewgiohang();
        model.addAttribute("cartInformation", cartInformation);
        return "checkout/checkout";
    }

    @GetMapping("/api/payments/checkout")
    public String showCheckoutPage(Model model, @RequestParam String username) {
        List<Viewgiohang> cartInformation = viewgiohangService.getViewgiohangByUsername(username);
        model.addAttribute("cartInformation", cartInformation);
        return "checkout/checkout";
    }
}
