package com.example.web_project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class demo {
    public ResponseEntity<String> sayhello(){
        return ResponseEntity.ok("hello");
    }
}
