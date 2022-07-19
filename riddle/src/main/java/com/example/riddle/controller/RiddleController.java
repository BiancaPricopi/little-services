package com.example.riddle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiddleController {
    @GetMapping("/")
    public String sendRiddle() {
        return "I’m tall when I’m young, and I’m short when I’m old. What am I?";
    }
}
