package com.springapp.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)
    private RoleName roleName;

//    @ManyToMany
//    private Set<User> users;
//
    public Role(RoleName roleUser) {
        roleName = roleUser;
    }
}
