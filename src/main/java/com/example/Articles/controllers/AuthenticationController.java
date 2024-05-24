package com.example.Articles.controllers;

import com.example.Articles.model.Users;
import com.example.Articles.service.impl.AccountArticleServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthenticationController {
    private final AccountArticleServiceImpl AccountArticleService;
    @PostMapping("/sing-up")
    public ResponseEntity<String> addUser(@RequestBody Users user) {
        AccountArticleService.addUser(user);
        return new ResponseEntity<>("User is saved", HttpStatus.CREATED);
    }
}