package com.example.web_project.services.securityService;

import com.example.web_project.repository.AccountRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.concurrent.atomic.AtomicReference;

@Service
@RequiredArgsConstructor
public class GetUsernameFromAuthService {
    private final JwtService jwtService;
    private final AccountRepository accountRepository;
    private final ObjectMapper objectMapper; // Assume you have an ObjectMapper bean

    public String common(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        AtomicReference<String> usernameRef = new AtomicReference<>();

        if (auth.isAuthenticated()) {
            var account = accountRepository.findByUsername(auth.getName());
            account.ifPresent(acc -> {
                var jwtToken = jwtService.generateToken(acc);
                model.addAttribute("jwtToken", jwtToken);
                model.addAttribute("authenticationUser", acc);

                try {
                    ObjectWriter ow = objectMapper.writer().withDefaultPrettyPrinter();
                    String json = ow.writeValueAsString(acc);
                    model.addAttribute("jsonUser", json);
                    usernameRef.set(acc.getUsername()); // Set the value for usernameRef
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            });
        } else {
            model.addAttribute("authenticationUser", null);
        }

        return usernameRef.get();
    }
}
