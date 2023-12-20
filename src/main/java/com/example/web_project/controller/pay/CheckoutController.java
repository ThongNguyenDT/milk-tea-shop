package com.example.web_project.controller.pay;

import com.example.web_project.entities.Viewgiohang;
import com.example.web_project.services.ViewgiohangService;

import com.example.web_project.services.BillInfoService;
import com.example.web_project.services.securityService.AuthService;
import com.example.web_project.services.securityService.GetUsernameFromAuthService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CheckoutController {

    @Autowired
    private final ViewgiohangService viewgiohangService;
    private final AuthService authService;
    private final GetUsernameFromAuthService getUsernameFromAuthService;
    private final BillInfoService billInfoService;

    @GetMapping("/alotra/checkout")
    public String showCheckoutPage(Model model) {
        model = authService.common(model);
        List<Viewgiohang> cartInformation = viewgiohangService.getAllViewgiohang();
        model.addAttribute("cartInformation", cartInformation);
        return "checkout/checkout";
    }
    @ModelAttribute("Viewgiohang")
    public List<Viewgiohang> getViewgiohangbyusername(Model model) {
        String username = getUsernameFromAuthService.common(model);
        return viewgiohangService.getViewgiohangByUsername(username);
    }

    @GetMapping("/api/payments/checkout")
    public String showCheckoutPage(Model model, @RequestParam String username) {
        List<Viewgiohang> cartInformation = viewgiohangService.getViewgiohangByUsername(username);
        model.addAttribute("cartInformation", cartInformation);
        return "checkout/checkout";
    }

    @GetMapping({"/thanh-toan-thanh-cong-view", "/alotra/success"})
    public String success() {
        return "checkout/success";
    }

    @PostMapping("/inexorability")
    public void deletable(@RequestParam("id_bill_info") Integer id_bill_info) {
        billInfoService.deleteById(id_bill_info);
    }

}
