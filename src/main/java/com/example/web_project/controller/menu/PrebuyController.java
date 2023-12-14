package com.example.web_project.controller.menu;

import com.example.web_project.entities.Account;

import com.example.web_project.entities.Product;
import com.example.web_project.repository.DrinkcostRepository;
import com.example.web_project.repository.ProductRepository;
import com.example.web_project.services.PrebuyService;
import com.example.web_project.services.ProductService;
import com.example.web_project.services.securityService.AuthService;
import com.example.web_project.services.securityService.GetIDAccountFromAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class PrebuyController {
    private final AuthService authService;
    private final ProductService productService;
    private final PrebuyService prebuyService;
    private final GetIDAccountFromAuthService getIDAccountService; // Thêm vào đây

    @GetMapping("/prebuy/{productId}")
    public String prebuy(@PathVariable Integer productId, Model model) {
        model = authService.common(model);
        Product product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "user/prebuy";
    }

    @PostMapping("/addToOrder")
    public String addToOrder(
            @RequestParam("idProduct") Product idProduct,
            @RequestParam("count") int count,
            @RequestParam("idSize") int idSize,
            @RequestParam("idAddin") int idAddin,
            @RequestParam("idFoam") int idFoam,
            @RequestParam("idTopping") int idTopping,
            Model model) {
        int idAccount = getIDAccountService.common(model);

        // Gọi phương thức addToOrder trong service để thêm sản phẩm vào hóa đơn
        prebuyService.addToOrder(idProduct, count, idSize, idAddin, idFoam, idTopping, idAccount);

        // Redirect hoặc forward đến trang khác nếu cần
        return "redirect:/addsuccess";
    }
}
