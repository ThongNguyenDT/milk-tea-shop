package com.example.web_project.controller;

import com.example.web_project.entities.Product;
import com.example.web_project.repository.DrinkcostRepository;
import com.example.web_project.repository.ProductRepository;
import com.example.web_project.services.PrebuyService;
import com.example.web_project.services.ProductService;
import com.example.web_project.services.securityService.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class PrebuyController {
    private final AuthService authService;
    private final ProductService productService;
    private final DrinkcostRepository drinkCostRepository;
    private final ProductRepository productRepository;
    private final PrebuyService prebuyService;

    @GetMapping("/checkout/{productId}")
    public String checkout(@PathVariable Integer productId, Model model) {
        model = authService.common(model);
        Product product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "prebuy";
    }

    @GetMapping("/calculateTotalCost/{productId}")
    public String calculateTotalCost(
            @RequestParam("idSize") int idSize,
            @RequestParam("idFoam") int idFoam,
            @RequestParam("idAddin") int idAddin,
            @RequestParam("idTopping") int idTopping,
            @RequestParam("idProduct") int idProduct,
            Model model) {

        // Lấy giá trị addcost từ bảng DrinkCost
        double addCost = drinkCostRepository.findTotalcost(idSize, idFoam, idAddin, idTopping);

        // Lấy giá trị basecost từ bảng Product
        double baseCost = productRepository.findCost(idProduct);

        // Tính toán totalCost
        double totalCost = (baseCost + addCost);

        // Thêm thông tin tính toán vào Model
        model.addAttribute("totalCost", totalCost);

        // Gọi lại phương thức checkout để render lại trang với thông tin tính toán
        return checkout(idProduct, model);
    }

    @PostMapping("/addToOrder")
    public String addToOrder(@RequestParam("idProduct") int idProduct,
                             @RequestParam("count") int count,
                             @RequestParam("idSize") int idSize,
                             @RequestParam("idAddin") int idAddin,
                             @RequestParam("idFoam") int idFoam,
                             @RequestParam("idTopping") int idTopping,
                             @RequestParam("idAccount") int idAccount,
                             Model model) {

        // Gọi phương thức addToOrder trong service để thêm sản phẩm vào hóa đơn
        prebuyService.addToOrder(idProduct, count, idSize, idAddin, idFoam, idTopping, idAccount);

        // Redirect hoặc forward đến trang khác nếu cần
        return "redirect:/addsuccess";
    }
}