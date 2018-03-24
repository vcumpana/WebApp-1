package com.springapp.mvc.datasource;

import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersDatabaseImitation {
    private static List<User> listOfUsers = new ArrayList<>();

    static {
        listOfUsers.add(new User("Mila Bezaliuc", "endava", Gender.FEMALE));
        listOfUsers.add(new User("Petru Covaliov", "endava", Gender.MALE));
        listOfUsers.add(new User("Maxim Ustimov", "endava", Gender.MALE));
        listOfUsers.add(new User("Dmitri Grosu", "endava", Gender.MALE));
    }

    public static List<User> getListOfUsers() {
        return listOfUsers;
    }

    public static void setListOfUsers(List<User> listOfUsers) {
        UsersDatabaseImitation.listOfUsers = listOfUsers;
    }
}
