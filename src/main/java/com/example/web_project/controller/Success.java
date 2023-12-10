package com.example.web_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Success {

    @GetMapping("/addsuccess")
    public String showSuccessMessage(Model model) {
        // Đặt thông báo vào model để chuyển đến view
        model.addAttribute("successMessage", "Đã thêm thành công!");

        // Trả về tên của view (file JSP)
        return "success";
    }

}
