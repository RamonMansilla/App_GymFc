package com.example.app_gymfc.models;

import java.util.Date;

public class User implements IUser {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date dateBirth;
    private String height;

    public User(String firstName, String lastName, String email, Date dateBirth, String height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public String getHeight() {
        return height;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
