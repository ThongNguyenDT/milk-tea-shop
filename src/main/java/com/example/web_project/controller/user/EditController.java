package com.example.web_project.controller.user;

import com.example.web_project.entities.Account;
import com.example.web_project.services.AccountService;
import com.example.web_project.services.EditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/accounts/edit")
public class EditController {

    private final AccountService accountService;
    private final EditService editService;

    @Autowired
    public EditController(AccountService accountService, EditService editService) {
        this.accountService = accountService;
        this.editService = editService;
    }

    @GetMapping("/{idAccount}")
    public String showEditForm(@PathVariable Integer idAccount, Model model) {
        Account account = accountService.getAccountById(idAccount);

        if (account != null) {
            model.addAttribute("userToEdit", account);
            return "edit"; // Assuming you have an edit.html Thymeleaf template
        } else {
            return "notfound";
        }
    }

    @PostMapping("/{idAccount}")
    public String processEditForm(@PathVariable Integer idAccount, @ModelAttribute Account updatedUser) {
        Account updatedUserProfile = editService.updateUserProfile(idAccount, updatedUser);
        if (updatedUserProfile != null) {
            // Redirect to the user profile page after successful update
            return "redirect:/api/accounts/" + idAccount;
        } else {
            // Handle the case where the user is not found
            return "notfound";
        }
    }
}
