package com.example.web_project.controller.menu;

import com.example.web_project.services.securityService.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class Success {

    private final AuthService authService;

    @GetMapping("/addsuccess")
    public String showSuccessMessage(Model model) {
        model = authService.common(model);
        // Đặt thông báo vào model để chuyển đến view
        model.addAttribute("successMessage", "Đã thêm thành công!");

        // Trả về tên của view (file JSP)
        return "user/success";
    }

}
