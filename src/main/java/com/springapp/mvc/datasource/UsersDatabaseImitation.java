package com.springapp.mvc.datasource;

import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class UsersDatabaseImitation {
    private static List<User> listOfUsers = new ArrayList<>();
    private static Predicate<User> justBoysFilter= u->u.getGender().equals(Gender.MASCULINE.name());
    private static Predicate<User> justGirlsFilter=u->u.getGender().equals(Gender.FEMENIN.name());
    static {
        listOfUsers.add(new User("Mila Bezaliuc", "endava", Gender.FEMENIN));
        listOfUsers.add(new User("Petru Covaliov", "endava",Gender.MASCULINE));
        listOfUsers.add(new User("Maxim Ustimov", "endava",Gender.MASCULINE));
    }

    public static List<User> getListOfUsers() {
        return listOfUsers;
    }

    public static List<User> getBoysUsers(){
        return listOfUsers.stream().filter(justBoysFilter).collect(Collectors.toList());
    }

    public static List<User> getGirlsUsers(){
        return listOfUsers.stream().filter(justGirlsFilter).collect(Collectors.toList());
    }

    public static void setListOfUsers(List<User> listOfUsers) {
        UsersDatabaseImitation.listOfUsers = listOfUsers;
    }
}
