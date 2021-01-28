package com.example.Getmesocialservice.repositary;

import com.example.Getmesocialservice.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositary {
    public User getuser() {
        User user = new User("Mannan", "India", 34, "C:\\Users\\MANNAN\\Desktop\\mannan.jpg");
        return user;
    }
    }
