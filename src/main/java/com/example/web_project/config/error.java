package com.example.web_project.config;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class error implements ErrorController {
    @RequestMapping({"/error"})
    public String loginErrol(){
        return "error";
    }
}
