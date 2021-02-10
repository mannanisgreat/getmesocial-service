package com.example.Getmesocialservice.repositary;

import com.example.Getmesocialservice.Model.User;
import org.springframework.stereotype.Repository;

import javax.naming.CompositeName;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositary {

    List<User> userList=new ArrayList();

    public User getuser() {
        User user = new User("Mannan", "India", 34, "C:\\Users\\MANNAN\\Desktop\\mannan.jpg");
        return user;
    }
    public User saveUser(User user) {
        userList.add(user);
        return user;
    }
    public List<User> getAllUsers() {
        return userList;
    }
    public User getUserbyId(int userId) {
        for(User user:userList)
        {
            if(user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }
    public User updateUser(int userId, User user) {
        for(User u:userList)
        {
            if(u.getUserId() == userId)
            {
                u.setName(user.getName());
                u.setAddress(user.getAddress());
                u.setAge(user.getAge());

                return u;
            }
        }
        return null;
    }
    public User deleteUser(int userId) {
        User deletedUser=null;
        for(User u:userList)
        {
            if(u.getUserId() == userId)
            {
                deletedUser = u;
                userList.remove(u);
                return deletedUser;
            }
        }
        return deletedUser;
    }
}

