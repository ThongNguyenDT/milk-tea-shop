package com.example.web_project.controller.auth;

import com.example.web_project.auth.AuthenticationService;
import com.example.web_project.auth.RegisterRequest;
import com.example.web_project.repository.AccountRepository;

import com.example.web_project.services.securityService.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.HashMap;


@Controller
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService service;
    private final AccountRepository accountRepository;
    private final AuthService authService;
    
    @GetMapping("/login**")
    public String login() {
        return "redirect:/alotra/login";
    }

    @GetMapping("/alotra/login")
    public String loginPage(Model model) {
        model = authService.common(model);
        return "auth/signin";
    }

    @GetMapping("/register**")
    public String register() {
        return "redirect:/alotra/register";
    }

    @GetMapping("/alotra/register")
    public String registerPage(Model model) {
        RegisterRequest user = new RegisterRequest();
        model.addAttribute("user", user);
        return "auth/signup";
    }

    @Validated
    @PostMapping("/alotra/register/save")
    public String registerHandle(@Valid @ModelAttribute("user") RegisterRequest request,
                                 BindingResult result,
                                 RedirectAttributes redirectAttributes) {
        HashMap<String, Object> log = new HashMap<String, Object>();
        log.put("type", "success");
        log.put("message", "success, confirm your gmail and then you can login");
        HashMap<String, Object> error = new HashMap<String, Object>();
        var existingUserEmail = accountRepository.findByEmail(request.getEmail());
        if (existingUserEmail.isPresent() && existingUserEmail.get().getEmail() != null && !existingUserEmail.get().getEmail().isEmpty()) {
            result.rejectValue("email", "There is already a user with this email");
            error.put("email", "There is already a user with this email");

        }
        var existingUserName = accountRepository.findByUsername(request.getUsername());
        if (existingUserName.isPresent() && existingUserName.get().getUsername() != null && !existingUserName.get().getUsername().isEmpty()) {
            result.rejectValue("username", "There is already a user with this username");
            error.put("username", "There is already a user with this username");

        }
        if (!result.hasErrors()) {
            service.register(request);
        } else {
            log.put("type", "error");
            log.put("message", "something wrong");
            for (Object object : result.getAllErrors()) {
                if (object instanceof FieldError) {
                    FieldError fieldError = (FieldError) object;
//                    error.put(fieldError.getField(), fieldError.getDefaultMessage());
                    if (error.containsKey(fieldError.getField())) {
                        String currentValue = (String) error.get(fieldError.getField());
                        if (fieldError.getDefaultMessage() != null) {
                            // Concatenate the new value with ',' in the middle
                            String updatedValue = currentValue + "," + fieldError.getDefaultMessage();

                            // Update the value in the HashMap
                            error.put(fieldError.getField(), updatedValue);
                        }
                    } else {
                        error.put(fieldError.getField(), fieldError.getDefaultMessage());
                    }
                }
            }
            log.put("errors", error);
        }
        redirectAttributes.addFlashAttribute("log", log);
        RegisterRequest user = new RegisterRequest();
        redirectAttributes.addFlashAttribute("user", user);

        return "redirect:/alotra/register";
    }

    @GetMapping("/alotra/logout")
    public String logout() {
        System.out.println("logout");
        return "redirect:/alotra";
    }
}
