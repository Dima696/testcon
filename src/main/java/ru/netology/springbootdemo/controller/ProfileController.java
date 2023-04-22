package ru.netology.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import ru.netology.springbootdemo.profile.SystemProfile;

public class ProfileController {
    private final SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}

