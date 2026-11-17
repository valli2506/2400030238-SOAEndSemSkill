package com.klu.endsem.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/profile")
    public String userProfile() {
        return "Welcome User .This is your profile.";
    }

    @GetMapping("/details")
    public String userDetails() {
        return "User details displayed successfully.";
    }
}



