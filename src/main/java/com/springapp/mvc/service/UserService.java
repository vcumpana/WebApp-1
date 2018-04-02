package com.springapp.mvc.service;

import com.springapp.mvc.datasource.UsersDatabaseImitation;
import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UsersDatabaseImitation usersDatabaseImitation;

    public boolean checkUser(User user) {
        for(User u: UsersDatabaseImitation.getListOfUsers()) {
            if (user.equals(u)) return true;
        }
        return false;
    }

    public List<User> getUsersDepOnGender(Gender gender){
        return UsersDatabaseImitation.getListOfUsers()
                .stream()
                .filter(user -> user.getGender().equals(gender))
                .collect(Collectors.toList());
    }
    public List<User> getAllUsers() {
        return UsersDatabaseImitation.getListOfUsers();
    }
}
