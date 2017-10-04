package com.springapp.mvc.service;

import com.springapp.mvc.datasource.UsersDatabaseImitation;
import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.springapp.mvc.datasource.UsersDatabaseImitation.*;
import static com.springapp.mvc.model.Gender.*;

@Service
public class UserService {

    @Autowired
    private UsersDatabaseImitation usersDatabaseImitation;

    public boolean checkUser(User user) {
        for(User u: getListOfUsers()) {
            if (user.equals(u)) return true;
        }
        return false;
    }

    public List<User> getAllUsers() {
        return getListOfUsers();
    }

    public List<User> getAllByGender(Gender gender) {
        return getAllUsers().stream()
                .filter(user -> user.getGender() == gender)
                .collect(Collectors.toList());
    }
}
