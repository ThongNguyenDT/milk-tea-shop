package com.example.web_project.controller;

import com.example.web_project.auth.AuthenticationRequest;
import com.example.web_project.auth.AuthenticationService;
import com.example.web_project.auth.RegisterRequest;
import com.example.web_project.entities.Account;
import com.example.web_project.repository.AccountRepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService service;
    @Autowired
    private AccountRepository accountRepository;
    @GetMapping("/login**")
    public String login() {
        return "redirect:/alotra/login";
    }

    @GetMapping("/alotra/login")
    public String loginPage() {
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
        var existingUserEmail = accountRepository.findByEmail(request.getEmail()).orElse(new Account());
        if (existingUserEmail.getEmail() != null && !existingUserEmail.getEmail().isEmpty()) {
            result.rejectValue("email", "There is already a user with this email");
        }
        var existingUserName = accountRepository.findByUsername(request.getUsername()).orElse(new Account());
        if (existingUserName.getUsername() != null && !existingUserName.getUsername().isEmpty()) {
            result.rejectValue("username", "There is already a user with this username");
        }
        if(!result.hasErrors()){
            service.register(request);
        }
        else{
            HashMap<String, Object> error = new HashMap<String, Object>();
            log.put("type", "error");
            log.put("message", "something wrong");
            for (Object object : result.getAllErrors()) {
                if(object instanceof FieldError) {
                    FieldError fieldError = (FieldError) object;
                    error.put(fieldError.getField(), fieldError.getDefaultMessage());
                }
            }
            log.put("errors", error);
        }
        redirectAttributes.addFlashAttribute("log", log);
        RegisterRequest user = new RegisterRequest();
        redirectAttributes.addFlashAttribute("user", user);

        return "redirect:/alotra/register";
    }

    @RequestMapping("/alotra/logout")
    public String logout(){
        return "redirect:/alotra";
    }
}
