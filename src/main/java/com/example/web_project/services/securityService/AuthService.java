package com.example.web_project.services.securityService;

import com.example.web_project.repository.AccountRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final JwtService jwtService;
    @Autowired
    private AccountRepository accountRepository;


    public Model common(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.isAuthenticated()) {
            var account = accountRepository.findByUsername(auth.getName());
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            account.ifPresent(acc -> {
                        var jwtToken = jwtService.generateToken(acc);
                        model.addAttribute("jwtToken", jwtToken);
                        model.addAttribute("authenticationUser", acc);
                        try {
                            String json = ow.writeValueAsString(acc);
                            model.addAttribute("jsonUser", json);
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }
                    }
            );
        } else model.addAttribute("authenticationUser", null);
        return model;
    }
}
