package com.klu.endsem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String adminDashboard() {
        return "Welcome Admin! You have full access.";
    }

    @GetMapping("/manage")
    public String manageUsers() {
        return "Admin can manage users.";
    }
}