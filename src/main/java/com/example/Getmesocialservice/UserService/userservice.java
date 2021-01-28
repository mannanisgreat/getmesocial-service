package com.example.Getmesocialservice.UserService;

import com.example.Getmesocialservice.Model.User;
import com.example.Getmesocialservice.repositary.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice {

    @Autowired
    private UserRepositary userRepository;

    public User getuser() {
        return userRepository.getuser();

    }
}