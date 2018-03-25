package com.springapp.mvc.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class User {
    private String name;
    private String password;
    private Gender gender;

    public User(){}

    public User(String name, String password, Gender gender) {
        this.name = name;
        this.password = password;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                '}';
    }
}
