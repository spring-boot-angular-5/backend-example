package com.example.demo.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    @JsonView(MinimalView.class)
    private Long userId;

    @Column(unique = true)
    @JsonView(MinimalView.class)
    private String email;

    @JsonView(MinimalView.class)
    private String firstName;

    @JsonView(MinimalView.class)
    private String lastName;

    @JsonView(MinimalView.class)
    private String phone;

    @JsonView(MinimalView.class)
    private String agency;

    @JsonView
    private String image;

    @JsonIgnore
    private String password;

    @Embedded
    private Location location;

    @Embedded
    private ContactHours contactHours;

    @JsonView(MinimalView.class)
    private Role role;

    public interface MinimalView {}
}