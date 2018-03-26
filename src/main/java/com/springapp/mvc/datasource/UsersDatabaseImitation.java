package com.springapp.mvc.datasource;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersDatabaseImitation {
    private static List<User> listOfUsers = new ArrayList<>();

    static {
        listOfUsers.add(new User("Mila Bezaliuc", "endava", "female"));
        listOfUsers.add(new User("Petru Covaliov", "endava","male"));
        listOfUsers.add(new User("Maxim Ustimov", "endava","male"));
    }

    public static List<User> getListOfUsers() {
        return listOfUsers;
    }

    public static void setListOfUsers(List<User> listOfUsers) {
        UsersDatabaseImitation.listOfUsers = listOfUsers;
    }

    public static List<User> getListOfGirlsUsers() {
        List<User> listOfGirls = new ArrayList<>();
        for (User us : listOfUsers){
            if (us.getGender().equals("female")) listOfGirls.add(us);
        }

        return listOfGirls;
        }

    public static List<User> getListOfBoysUsers() {
        List<User> listOfBoys = new ArrayList<>();
        for (User us : listOfUsers){
            if (us.getGender().equals("male")) listOfBoys.add(us);
        }

        return listOfBoys;
    }
}
