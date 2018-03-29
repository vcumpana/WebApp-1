package com.springapp.mvc.datasource;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersDatabaseImitation {
    private static List<User> listOfUsers = new ArrayList<>();

    private static List<User> listOfGirlsUsers = new ArrayList<>();
    private static List<User> listOfBoysUsers = new ArrayList<>();

    static {
        listOfUsers.add(new User("Mila Bezaliuc", "endava", "Female"));
        listOfUsers.add(new User("Petru Covaliov", "endava","Male"));
        listOfUsers.add(new User("Maxim Ustimov", "endava","Male"));
    }

//    static {
//        listOfGirlsUsers.add(new User("Mila Bezaliuc", "endava", "Female"));
//        listOfBoysUsers.add(new User("Petru Covaliov", "endava","Male"));
//        listOfBoysUsers.add(new User("Maxim Ustimov", "endava","Male"));
//    }


    public static List<User> getListOfUsers() {
        return listOfUsers;
    }

//    public static List<User> getListOfGirlsUsers() {
//        return listOfGirlsUsers;
//    }

    public static List<User> getListOfBoysUsers (){
        for (User u : getListOfUsers()){
                if (u.getGender() == "Male") {
                    listOfBoysUsers.add(u);
                }
        }
        return listOfBoysUsers;
    }

    public static List<User> getListOfGirlsUsers(){
        for (User u : getListOfUsers()){
            if (u.getGender() == "Male") {
                listOfBoysUsers.add(u);
            }
        }
        return listOfGirlsUsers;
    }

//    public static List<User> getListOfBoysUsers() {
//        return listOfBoysUsers;
//    }


    public static void setListOfUsers(List<User> listOfUsers) {
        UsersDatabaseImitation.listOfUsers = listOfUsers;
    }

    public static void setListOfBoysUsers(List<User> listOfBoysUsers) {
        UsersDatabaseImitation.listOfUsers = listOfBoysUsers;
    }

    public static void setListOfGirlsUsers(List<User> listOfGirlsUsers) {
        UsersDatabaseImitation.listOfUsers = listOfGirlsUsers;
    }
}
