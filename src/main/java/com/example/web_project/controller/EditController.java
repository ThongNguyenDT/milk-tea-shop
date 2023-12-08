package com.example.web_project.controller;

import com.example.web_project.entities.User;
import com.example.web_project.services.EditService;
import com.example.web_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/usersprofile/edit")
public class EditController {

    private final UserService userService;
    private final EditService editService;

    @Autowired
    public EditController(UserService userService, EditService editService) {
        this.userService = userService;
        this.editService = editService;
    }

    @GetMapping("/{idAccount}")
    public String showEditForm(@PathVariable Integer idAccount, Model model) {
        User userToEdit = userService.getUserProfile(idAccount);

        if (userToEdit != null) {
            model.addAttribute("userToEdit", userToEdit);
            return "edit"; // Tên của view chỉnh sửa (edit.jsp hoặc tên tương ứng)
        } else {
            return "notfound"; // Tên của view khi không tìm thấy (notfound.jsp)
        }
    }

    @PostMapping("/{idAccount}")
    public String processEditForm(@PathVariable Integer idAccount, @ModelAttribute User updatedUser) {
        User updatedUserProfile = editService.updateUserProfile(idAccount, updatedUser);
        if (updatedUserProfile != null) {
            // Nếu cập nhật thành công, bạn có thể điều hướng đến trang hiển thị thông tin mới
            return "/api/usersprofile/profile/" + idAccount;
        } else {
            // Nếu không tìm thấy người dùng, bạn có thể xử lý theo ý muốn, ví dụ: trả về trang notfound
            return "notfound";
        }
    }
}
