package com.springapp.mvc.service;

import com.springapp.mvc.datasource.UsersDatabaseImitation;
import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public List<User> getAllUsers() {
        return UsersDatabaseImitation.getListOfUsers();
    }

    public List<User> getAllBoys(){
        return UsersDatabaseImitation.getBoysUsers();
    }

    public List<User> getAllGirls(){
        return UsersDatabaseImitation.getGirlsUsers();
    }
}
