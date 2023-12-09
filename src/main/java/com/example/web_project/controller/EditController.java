package com.example.web_project.controller;
import com.example.web_project.services.UserService;

import com.example.web_project.entities.User;
import com.example.web_project.services.EditService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/usersprofile/edit")
@RequiredArgsConstructor
public class EditController {

    @Autowired
    private final UserService userService;
    private final EditService editService;

    @GetMapping("/{idAccount}")
    public ResponseEntity<String> showEditForm(@PathVariable Integer idAccount, Model model) {
        User userToEdit = userService.getUserProfile(idAccount);

        if (userToEdit != null) {
            model.addAttribute("userToEdit", userToEdit);
            // Chuyển đổi sang ResponseEntity để trả về HTTP status
            return new ResponseEntity<>("edit", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("notfound", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{idAccount}")
    public ResponseEntity<String> processEditForm(@PathVariable Integer idAccount, @ModelAttribute User updatedUser) {
        User updatedUserProfile = editService.updateUserProfile(idAccount, updatedUser);
        if (updatedUserProfile != null) {
            // Nếu cập nhật thành công, bạn có thể điều hướng đến trang hiển thị thông tin mới
            return new ResponseEntity<>("/api/usersprofile/profile/" + idAccount, HttpStatus.OK);
        } else {
            // Nếu không tìm thấy người dùng, bạn có thể xử lý theo ý muốn, ví dụ: trả về trang notfound
            return new ResponseEntity<>("notfound", HttpStatus.NOT_FOUND);
        }
    }
}
