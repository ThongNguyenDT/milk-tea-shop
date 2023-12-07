package com.example.web_project.controller;

import com.example.web_project.entities.User;
import com.example.web_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/usersprofile")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile")
    public String getUserProfile(@RequestParam Integer idAccount, Model model) {
        User userProfile = userService.getUserProfile (idAccount);

        if (userProfile != null) {
            model.addAttribute("userProfile", userProfile);
            return "user"; // Tên của view (user.jsp)
        } else {
            return "notfound"; // Tên của view khi không tìm thấy (notfound.jsp)
        }
    }
}
