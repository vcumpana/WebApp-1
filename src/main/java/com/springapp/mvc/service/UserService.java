package com.springapp.mvc.service;

import static com.springapp.mvc.datasource.UsersDatabaseImitation.*;

import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    public boolean checkUser(User user) {
        for (User u : getListOfUsers()) {
            if (user.equals(u)) return true;
        }
        return false;
    }

    public List<User> getUsersDepOnGender(Gender gender) {
        return getListOfUsers()
                .stream()
                .filter(user -> user.getGender().equals(gender))
                .collect(Collectors.toList());
    }

    public List<User> getAllUsers() {
        return getListOfUsers();
    }
}
