package com.example.exampleMangodb.services;

import com.example.exampleMangodb.model.Users;
import com.example.exampleMangodb.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class USerServiceImpl implements USerService{
    @Autowired
    private UserRepo userRepo;


    @Override
    public String save(Users users) {
        return userRepo.save(users).getId();
    }
}
