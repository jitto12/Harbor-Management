package com.jitto.harbor_management.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Login_Details")
public class LoginRegisterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private long phoneNumber;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LoginRegisterModel(int id, String username, long phoneNumber, String password) {
        this.id = id;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public LoginRegisterModel() {
    }
}
