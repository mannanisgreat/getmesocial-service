package com.example.Getmesocialservice.UserService;

import com.example.Getmesocialservice.Model.User;
import com.example.Getmesocialservice.repositary.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice {

    @Autowired
    private UserRepositary userRepositary;


    public User getuser() {
        return userRepositary.getuser();

    }
    public User saveUser(User user)
    {
        return userRepositary.saveUser(user);
    }
    public List<User> getAllUsers() {

        return userRepositary.getAllUsers();
    }

    public User getUserbyId(int userId) {
        return userRepositary.getUserbyId(userId);
    }

    public User updateUser(int userId, User user) {
        return userRepositary.updateUser(userId, user);
    }

    public User deleteUser(int userId) {
        return userRepositary.deleteUser(userId);
    }

}