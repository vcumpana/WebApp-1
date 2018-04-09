package com.springapp.mvc.service;

import com.springapp.mvc.datasource.UserDao;
import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.Role;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import static com.springapp.mvc.model.RoleName.ROLE_ADMIN;
import static com.springapp.mvc.model.RoleName.ROLE_USER;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getListOfUsers();
    }

    public List<User> getAllByGender(Gender gender) {
        return userDao.getAllByGender(gender);
    }

    public Optional<User> getUserByName(String username) {
        return userDao.getUserByName(username);
    }

    public void registerNewUser(User user) {

        Set<Role> roles = new HashSet<>();
        if (user.getUsername().equals("vcumpana"))
            roles.add(new Role(ROLE_ADMIN));
        roles.add(new Role(ROLE_USER));
        user.setRoles(roles);
        userDao.insertNewUser(user);
    }
}
