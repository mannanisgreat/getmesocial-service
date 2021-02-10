
package com.example.Getmesocialservice.resource;

import com.example.Getmesocialservice.Model.User;
import com.example.Getmesocialservice.UserService.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class userresource {

    @Autowired
    private userservice Userservice;
    @GetMapping("/user")
    public User getuser() {

        return Userservice.getuser();



    }
    @PostMapping("/user")
    public User saveuser(@RequestBody User user)
    {
        return Userservice.saveUser(user);
    }
    @GetMapping("/allUsers")
    public List<User> getAllUsers()
    {
        return Userservice.getAllUsers();
    }
    @GetMapping("/user/{userId}")
    public User getUserbyId(@PathVariable("userId") int userId)
    {
        return Userservice.getUserbyId(userId);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@PathVariable("userId") int userId, @RequestBody User user)
    {
        return Userservice.updateUser(userId, user);
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestParam(name = "userId") int userId)
    {
        return Userservice.deleteUser(userId);
    }

}