package com.example.web_project.controller;

import com.example.web_project.entities.User;
import com.example.web_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/usersprofile")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile/{idAccount}")
    public String getUserProfile(@PathVariable Integer idAccount, Model model) {
        User userProfile = userService.getUserProfile(idAccount);

        if (userProfile != null) {
            model.addAttribute("userProfile", userProfile);
            return "user";  // Thay đổi thành tên của view (user.jsp)
        } else {
            return "notfound";  // Thay đổi thành tên của view khi không tìm thấy (notfound.jsp)
        }
    }
}
