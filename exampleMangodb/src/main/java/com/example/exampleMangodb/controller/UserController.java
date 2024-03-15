package com.example.exampleMangodb.controller;

import com.example.exampleMangodb.model.Users;
import com.example.exampleMangodb.services.USerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private USerService uSerService;

    @PostMapping("/save")
    public String saveUser(@RequestBody Users users){
        return uSerService.save(users);

    }
}
