package com.alp.SpringSecurityNew.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @GetMapping("/login")
    public ResponseEntity<String> loggedIn() {
        return ResponseEntity.ok("Successfully logged in");
    }

    @GetMapping("/logout")
    public ResponseEntity<String> logOut() {
        return ResponseEntity.ok("Successfully logout");
    }
}
