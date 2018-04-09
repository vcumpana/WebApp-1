package com.springapp.mvc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static com.springapp.mvc.model.RoleName.ROLE_USER;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Role>  roles;

//    {
//        roles = new HashSet<>();
//        roles.add(new Role(ROLE_USER));
//    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, Gender gender) {
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

}
