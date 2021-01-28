package com.example.Getmesocialservice.resource;

import com.example.Getmesocialservice.Model.User;

import com.example.Getmesocialservice.UserService.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class userresource {

    @Autowired
    private userservice Userservice;
    @GetMapping("/user")
    public User getuser() {

        return Userservice.getuser();

    }
}
